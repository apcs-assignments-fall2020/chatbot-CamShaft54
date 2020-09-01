import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hi, " + name + "!" + "\nWhat is your favorite color, " + name + "?");
        String color = scan.next();
        System.out.println("I like the color " + color + " too!" + "\nWhat is your Social Security Number?");
        String SSN = scan.next();
        System.out.println("MUHAHAHAHA NOW I KNOW YOUR SOCIAL SECURITY NUMBER IS " + SSN + "!");
        scan.close();
    }
}
