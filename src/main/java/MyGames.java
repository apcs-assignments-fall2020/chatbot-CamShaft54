import java.util.Random;
import java.util.Scanner;

public class MyGames {
    public static void GuessANumber(Scanner scan) {
        System.out.println("I'm thinking of a number between 1 and 10, what is my number? You have three guesses.");
        Random rand = new Random();
        String num = "" + (rand.nextInt(10) + 1);
        for (int i = 0; i < 3; i++) {
            String answer = scan.next();
            if (answer.equals(num)) {
                System.out.println("Correct! I won't tell anyone your SSN :)");
                break;
            }
            else if (i == 2) {
                System.out.println("HAHAHA! You lost! My number was " + num + ". Goodbye!");
                break;
            }
            System.out.println("Incorrect, try again.");
        }
    }
}
