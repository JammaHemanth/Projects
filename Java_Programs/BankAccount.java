import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class DatabaseManager {
    private Connection connection;

    public DatabaseManager() {
        try {
            // Assuming you have a MySQL database running locally with user 'root' and password 'password'
            String url = "jdbc:mysql://localhost:3306/banking";
            String user = "root";
            String password = "password";

            connection = DriverManager.getConnection(url, user, password);
            createTableIfNotExists();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTableIfNotExists() {
        try (Statement statement = connection.createStatement()) {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS accounts (" +
                    "account_number VARCHAR(20) PRIMARY KEY," +
                    "account_holder VARCHAR(50)," +
                    "balance DOUBLE)";
            statement.executeUpdate(createTableQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveAccount(BankAccount account) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accounts VALUES (?, ?, ?)")) {
            preparedStatement.setString(1, account.getAccountNumber());
            preparedStatement.setString(2, account.getAccountHolder());
            preparedStatement.setDouble(3, account.getBalance());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public BankAccount getAccount(String accountNumber) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM accounts WHERE account_number = ?")) {
            preparedStatement.setString(1, accountNumber);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String accountHolder = resultSet.getString("account_holder");
                double balance = resultSet.getDouble("balance");
                return new BankAccount(accountNumber, accountHolder, balance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}

class BankGUI extends Frame implements ActionListener {
    private BankAccount currentAccount;
    private DatabaseManager databaseManager;

    private TextField accountNumberField, accountHolderField, amountField;
    private Button depositButton, withdrawButton, checkBalanceButton;

    public BankGUI(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;

        accountNumberField = new TextField(20);
        accountHolderField = new TextField(20);
        amountField = new TextField(20);

        depositButton = new Button("Deposit");
        withdrawButton = new Button("Withdraw");
        checkBalanceButton = new Button("Check Balance");

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        checkBalanceButton.addActionListener(this);

        add(new Label("Account Number:"));
        add(accountNumberField);
        add(new Label("Account Holder:"));
        add(accountHolderField);
        add(new Label("Amount:"));
        add(amountField);
        add(depositButton);
        add(withdrawButton);
        add(checkBalanceButton);

        setLayout(new FlowLayout());
        setSize(400, 200);
        setTitle("Banking Application");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accountNumber = accountNumberField.getText();
        String accountHolder = accountHolderField.getText();
        double amount = Double.parseDouble(amountField.getText());

        if (currentAccount == null) {
            currentAccount = new BankAccount(accountNumber, accountHolder);
            databaseManager.saveAccount(currentAccount);
        } else {
            currentAccount = databaseManager.getAccount(accountNumber);
        }

        if (e.getSource() == depositButton) {
            currentAccount.deposit(amount);
        } else if (e.getSource() == withdrawButton) {
            currentAccount.withdraw(amount);
        } else if (e.getSource() == checkBalanceButton) {
            System.out.println("Current balance: " + currentAccount.getBalance());
        }

        databaseManager.saveAccount(currentAccount);
    }
}

public class SimpleBankingApplication {
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();
        new BankGUI(databaseManager);
    }
}
