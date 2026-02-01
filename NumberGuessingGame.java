import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String playAgain = "yes";
        int score = 0;
        
        while (playAgain.equals("yes")) {
            // Generate random number between 1 and 100
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean won = false;
            
            System.out.println("\nGuess the number between 1 and 100!");
            System.out.println("You have " + maxAttempts + " attempts.");
            
            // Game loop
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess == number) {
                    System.out.println("Correct! You won in " + attempts + " attempts.");
                    score++;
                    won = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }
            
            if (!won) {
                System.out.println("Game Over! The number was: " + number);
            }
            
            // Ask to play again
            System.out.print("\nPlay again? (yes/no): ");
            playAgain = scanner.next();
        }
        
        System.out.println("\nYour total score: " + score + " rounds won.");
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}