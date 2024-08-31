package forMyOwnPractice.ControlStatements.Looping.BasicLoopings;

import java.util.Scanner;

/*
Create a program using do-while to implement a number guessing game.
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("\n\n--------------- Welcome to our Number Guessing Game Zone -------------- \n\n");
        Scanner sc = new Scanner(System.in);

        int num = 4, guess;
        do{
            System.out.println("Please guess the number between 0-10: ");
            guess = sc.nextInt();

            System.out.println("Good Luck. \n \t Try again...");
        }while(num != guess);
        System.out.println("You have successfully guess the number.");
    }
}
