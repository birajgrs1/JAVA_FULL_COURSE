package forMyOwnPractice.ControlStatements.BreakAndContinue;

import java.util.Scanner;

/*
Create a program using break to read inputs from the user in a loop and break
the loop if a specific keyword (like "exit") is entered.
 */
public class Practice_Break {

    public static void main(String[] args) {

        System.out.println("\n-----Practice_Break--------\n");

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter any input: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("You entered: " + input);
        }
        System.out.println("You have successfully exited.");

    }
}
