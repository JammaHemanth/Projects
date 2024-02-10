import java.util.Scanner;
import java.lang.Math;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Logarithm");
            System.out.println("8. Trigonometric Operations");
            System.out.println("9. Calculate Rectangle Area");
            System.out.println("10. Calculate Rectangle Perimeter");
            System.out.println("11. Calculate Circle Area");
            System.out.println("12. Calculate Circle Circumference");
            System.out.println("13. Calculate Triangle Area");
            System.out.println("14. Calculate Triangle Perimeter");
            System.out.println("15. Calculate Simple Interest");
            System.out.println("16. Calculate Compound Interest");
            System.out.println("17. Calculate Loan Amount");
            System.out.println("18. Perform Arithmetic Reasoning");
            System.out.println("19. Perform Encoding/Decoding");
            System.out.println("0. Exit\n");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performSquareRoot(scanner);
                    break;
                case 6:
                    performExponentiation(scanner);
                    break;
                case 7:
                    performLogarithm(scanner);
                    break;
                case 8:
                    performTrigonometricOperations(scanner);
                    break;
                case 9:
                    calculateRectangleArea(scanner);
                    break;
                case 10:
                    calculateRectanglePerimeter(scanner);
                    break;
                case 11:
                    calculateCircleArea(scanner);
                    break;
                case 12:
                    calculateCircleCircumference(scanner);
                    break;
                case 13:
                    calculateTriangleArea(scanner);
                    break;
                case 14:
                    calculateTrianglePerimeter(scanner);
                    break;
                case 15:
                    calculateSimpleInterest(scanner);
                    break;
                case 16:
                    calculateCompoundInterest(scanner);
                    break;
                case 17:
                    calculateLoanAmount(scanner);
                    break;
                case 18:
                    performArithmeticReasoning(scanner);
                    break;
                case 19:
                    performEncodingDecoding(scanner);
                    break;    
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }

    // Define functions for various operations and shape calculations here

    private static void performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero.");
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num >= 0) {
            double result = Math.sqrt(num);
            System.out.println("Square Root: " + result);
        } else {
            System.out.println("Error: Cannot calculate square root of a negative number.");
        }
    }

    private static void performExponentiation(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    private static void performLogarithm(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        System.out.print("Enter base (logarithm base): ");
        double base = scanner.nextDouble();
        if (num > 0 && base > 0 && base != 1) {
            double result = Math.log(num) / Math.log(base);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Invalid input for logarithm.");
        }
    }

    private static void performTrigonometricOperations(Scanner scanner) {
        System.out.println("Select trigonometric operation:");
        System.out.println("1. Sine (sin)");
        System.out.println("2. Cosine (cos)");
        System.out.println("3. Tangent (tan)");
        System.out.println("4. Inverse Sine (asin)");
        System.out.println("5. Inverse Cosine (acos)");
        System.out.println("6. Inverse Tangent (atan)");
        System.out.print("Enter your choice: ");
        int trigChoice = scanner.nextInt();

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        double radians = Math.toRadians(angle);

        double result = 0;

        switch (trigChoice) {
            case 1:
                result = Math.sin(radians);
                System.out.println("Sine (sin) of " + angle + " degrees: " + result);
                break;
            case 2:
                result = Math.cos(radians);
                System.out.println("Cosine (cos) of " + angle + " degrees: " + result);
                break;
            case 3:
                result = Math.tan(radians);
                System.out.println("Tangent (tan) of " + angle + " degrees: " + result);
                break;
            case 4:
                if (angle >= -90 && angle <= 90) {
                    result = Math.asin(Math.sin(radians));
                    System.out.println("Inverse Sine (asin) of " + angle + " degrees: " + Math.toDegrees(result));
                } else {
                    System.out.println("Error: Invalid input for inverse sine.");
                }
                break;
            case 5:
                if (angle >= 0 && angle <= 180) {
                    result = Math.acos(Math.cos(radians));
                    System.out.println("Inverse Cosine (acos) of " + angle + " degrees: " + Math.toDegrees(result));
                } else {
                    System.out.println("Error: Invalid input for inverse cosine.");
                }
                break;
            case 6:
                result = Math.atan(Math.tan(radians));
                System.out.println("Inverse Tangent (atan) of " + angle + " degrees: " + Math.toDegrees(result));
                break;
            default:
                System.out.println("Invalid choice for trigonometric operation.");
        }
    }

    private static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }

    private static void calculateRectanglePerimeter(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }

    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        if (radius >= 0) {
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Circle Area: " + area);
        } else {
            System.out.println("Error: Invalid input for circle radius.");
        }
    }

    private static void calculateCircleCircumference(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        if (radius >= 0) {
            double circumference = 2 * Math.PI * radius;
            System.out.println("Circle Circumference: " + circumference);
        } else {
            System.out.println("Error: Invalid input for circle radius.");
        }
    }

    private static void calculateTriangleArea(Scanner scanner) {
        System.out.println("Select type of triangle:");
        System.out.println("1. Right-Angle Triangle");
        System.out.println("2. Isosceles Triangle");
        System.out.println("3. Acute-Angle Triangle");
        System.out.print("Enter your choice: ");
        int triangleChoice = scanner.nextInt();

        if (triangleChoice == 1) {
            System.out.print("Enter the base of the right-angle triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the right-angle triangle: ");
            double height = scanner.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Right-Angle Triangle Area: " + area);
        } else if (triangleChoice == 2) {
            System.out.print("Enter the base of the isosceles triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the equal side length of the isosceles triangle: ");
            double side = scanner.nextDouble();
            double area = 0.5 * base * Math.sqrt(side * side - 0.25 * base * base);
            System.out.println("Isosceles Triangle Area: " + area);
        } else if (triangleChoice == 3) {
            System.out.print("Enter the base of the acute-angle triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the acute-angle triangle: ");
            double height = scanner.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Acute-Angle Triangle Area: " + area);
        } else {
            System.out.println("Invalid choice for triangle type.");
        }
    }

    private static void calculateTrianglePerimeter(Scanner scanner) {
        System.out.println("Select type of triangle:");
        System.out.println("1. Right-Angle Triangle");
        System.out.println("2. Isosceles Triangle");
        System.out.println("3. Acute-Angle Triangle");
        System.out.print("Enter your choice: ");
        int triangleChoice = scanner.nextInt();

        if (triangleChoice == 1) {
            System.out.print("Enter the lengths of the two sides of the right-angle triangle (other than the hypotenuse): ");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            System.out.print("Enter the length of the hypotenuse: ");
            double hypotenuse = scanner.nextDouble();
            double perimeter = side1 + side2 + hypotenuse;
            System.out.println("Right-Angle Triangle Perimeter: " + perimeter);
        } else if (triangleChoice == 2) {
            System.out.print("Enter the length of the base of the isosceles triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the lengths of the equal sides: ");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double perimeter = base + 2 * side1;
            System.out.println("Isosceles Triangle Perimeter: " + perimeter);
        } else if (triangleChoice == 3) {
            System.out.print("Enter the lengths of the three sides of the acute-angle triangle: ");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();
            double perimeter = side1 + side2 + side3;
            System.out.println("Acute-Angle Triangle Perimeter: " + perimeter);
        } else {
            System.out.println("Invalid choice for triangle type.");
        }
        private static void calculateSimpleInterest(Scanner scanner) {
            System.out.print("Enter principal amount: ");
            double principal = scanner.nextDouble();
            System.out.print("Enter interest rate (as a percentage): ");
            double rate = scanner.nextDouble() / 100;
            System.out.print("Enter time period (in years): ");
            double time = scanner.nextDouble();

            double simpleInterest = (principal * rate * time);
            System.out.println("Simple Interest: " + simpleInterest);
        }

        private static void calculateCompoundInterest(Scanner scanner) {
            System.out.print("Enter principal amount: ");
            double principal = scanner.nextDouble();
            System.out.print("Enter interest rate (as a percentage): ");
            double rate = scanner.nextDouble() / 100;
            System.out.print("Enter time period (in years): ");
            double time = scanner.nextDouble();
            System.out.print("Enter the number of times interest is compounded per year: ");
            int n = scanner.nextInt();

            double compoundInterest = principal * Math.pow(1 + (rate / n), n * time) - principal;
            System.out.println("Compound Interest: " + compoundInterest);
        }

        private static void calculateLoanAmount(Scanner scanner) {
            System.out.print("Enter monthly payment: ");
            double monthlyPayment = scanner.nextDouble();
            System.out.print("Enter annual interest rate (as a percentage): ");
            double annualInterestRate = scanner.nextDouble() / 100;
            System.out.print("Enter the loan term in years: ");
            double years = scanner.nextDouble();

            double monthlyInterestRate = annualInterestRate / 12;
            double numberOfPayments = years * 12;

            double loanAmount = (monthlyPayment * (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments))) / monthlyInterestRate;
            System.out.println("Loan Amount: " + loanAmount);
        }
        
            private static void performArithmeticReasoning(Scanner scanner) {
                // Example of an arithmetic reasoning task
                System.out.println("Solve the following arithmetic reasoning task:");
                System.out.println("If John has 5 apples and he eats 2 of them, how many apples does he have left?");
                System.out.print("Your answer: ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == 3) {
                    System.out.println("Correct! John has 3 apples left.");
                } else {
                    System.out.println("Incorrect. John has 3 apples left.");
                }
            }

            private static void performEncodingDecoding(Scanner scanner) {
                System.out.print("Enter a string to encode/decode: ");
                scanner.nextLine();  // Consume the newline character
                String inputString = scanner.nextLine();

                System.out.println("Select operation:");
                System.out.println("1. Encode (Caesar Cipher)");
                System.out.println("2. Decode (Caesar Cipher)");
                int encodingChoice = scanner.nextInt();

                System.out.print("Enter the shift value for the Caesar Cipher: ");
                int shift = scanner.nextInt();

                if (encodingChoice == 1) {
                    String encodedString = caesarCipherEncode(inputString, shift);
                    System.out.println("Encoded String: " + encodedString);
                } else if (encodingChoice == 2) {
                    String decodedString = caesarCipherDecode(inputString, shift);
                    System.out.println("Decoded String: " + decodedString);
                } else {
                    System.out.println("Invalid choice for encoding/decoding.");
                }
            }

            private static String caesarCipherEncode(String input, int shift) {
                StringBuilder encoded = new StringBuilder();

                for (char character : input.toCharArray()) {
                    if (Character.isLetter(character)) {
                        char base = Character.isLowerCase(character) ? 'a' : 'A';
                        encoded.append((char) (((character - base + shift) % 26) + base));
                    } else {
                        encoded.append(character);
                    }
                }

                return encoded.toString();
            }

            private static String caesarCipherDecode(String input, int shift) {
                return caesarCipherEncode(input, 26 - shift);  // Decoding is the same as encoding with a shift of (26 - shift)
            
    }
}