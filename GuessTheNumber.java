import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int score = 0;

        System.out.println("Welcome to Guess the Number Game!");

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("\nI've picked a number between " + minRange + " and " + maxRange + ". Can you guess what it is?");

            int attempts = 0;
            boolean guessedCorrectly = false;
            while (attempts < attemptsLimit && !guessedCorrectly) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "/" + attemptsLimit + "): ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    guessedCorrectly = true;
                    score += (attemptsLimit - attempts); // Increase score based on remaining attempts
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                attempts++;
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }

            System.out.print("Your current score: " + score);
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainResponse = scanner.nextLine();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing Guess the Number Game! Your final score is: " + score);
        scanner.close();
    }
}
