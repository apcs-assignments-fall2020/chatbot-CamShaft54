import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.next();
        System.out.println("Hi, " + name + "!" + "\nWhat is your favorite color, " + name + "?");
        String color = scan.next();
        System.out.println("I like the color " + color + " too!" + "\nWhat is your age?");
        String age = scan.next();
        System.out.println("I wish I was " + age + ". I'm only 2 days old!\nWhat is your Social Security Number?");
        String SSN = scan.next();
        System.out.println("MUHAHAHAHA NOW I KNOW YOUR SOCIAL SECURITY NUMBER IS " + SSN + "!" +
                "\n...\nMaybe I won't sell it on the dark web...\nHere's what I will do, " +
                "if you win my game I won't give away your SSN, do you agree? (yes or no)");
        String decision = scan.next();
        if (decision.equals("yes")) {
            System.out.println("Ok, let the game begin!");
            MyGames.GuessANumber(scan);
        }
        else {
            System.out.println("You don't want to play my game!!! How rude :(\nDo you not like me or something?");
            if (scan.next().equals("yes")) {
                System.out.println("Aww, thank you! I still like you too! I won't give away your SSN.");
            }
            else {
                System.out.println(":( You are so mean! That's it! I'm giving away your SSN!");
            }
        }
        scan.close();
    }
}
