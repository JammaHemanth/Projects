import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nCalculator and Shape Properties:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Rectangle Properties");
            System.out.println("6. Circle Properties");
            System.out.println("7. Triangle Properties");
            System.out.println("8. Exit \n");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    calculateRectangleProperties();
                    break;
                case 6:
                    calculateCircleProperties();
                    break;
                case 7:
                    calculateTriangleProperties();
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }

    // Calculator operations
    public static void performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: \n");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: \n");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        }
    }
    
    

    // Shape properties
    public static void calculateRectangleProperties() {
        // Implement the rectangle properties calculation as shown in the previous response.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Rectangle Properties:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void calculateCircleProperties() {
        // Implement the circle properties calculation as shown in the previous response.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Circle Properties:");
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void calculateTriangleProperties() {
        // Implement the triangle properties calculation as shown in the previous response.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;
        double perimeter = 3 * base; // Assuming an equilateral triangle for simplicity

        System.out.println("Triangle Properties:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
