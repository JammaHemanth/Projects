import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Set number of guesses allowed
        int maxGuesses = 5;

        // Game loop
        int guessNumber = 0;
        int guessCount = 0;
        boolean isGuessedCorrectly = false;
        while (guessCount < maxGuesses && !isGuessedCorrectly) {
            // Get user input
            System.out.print("Guess the number (1-100): ");
            guessNumber = scanner.nextInt();

            // Check if guess is correct
            if (guessNumber == numberToGuess) {
                isGuessedCorrectly = true;
            } else if (guessNumber < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }

            // Increase guess count
            guessCount++;
        }

        // Display results
        if (isGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the number in " + guessCount + " guesses.");
        } else {
            System.out.println("Sorry, you ran out of guesses. The number was " + numberToGuess + ".");
        }

        // Close scanner
        scanner.close();
    }
}
