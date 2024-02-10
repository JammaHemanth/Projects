import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Define exchange rates
        HashMap<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("GBP", 0.81);
        exchangeRates.put("JPY", 133.0);

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Currency Converter!");

        // Loop until user exits
        while (true) {
            // Get user input
            System.out.println("Please enter the amount you want to convert:");
            double amount = scanner.nextDouble();
            System.out.println("Please enter the currency you want to convert from:");
            String fromCurrency = scanner.next();
            System.out.println("Please enter the currency you want to convert to:");
            String toCurrency = scanner.next();

            // Check if currencies exist
            if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
                System.out.println("Invalid currency code. Please try again.");
                continue;
            }

            // Calculate conversion
            double convertedAmount = amount * exchangeRates.get(toCurrency) / exchangeRates.get(fromCurrency);

            // Print result
            System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);

            // Ask if user wants to continue
            System.out.println("Do you want to convert another amount? (Y/N)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Close scanner
        scanner.close();
    }
}

/*
 * 
 * 
 */