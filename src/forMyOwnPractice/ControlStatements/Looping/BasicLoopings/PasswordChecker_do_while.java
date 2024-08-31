package forMyOwnPractice.ControlStatements.Looping.BasicLoopings;

import java.util.Scanner;
/*
Create a program using do-while to find password checker until a valid
password is entered.
 */

public class PasswordChecker_do_while {

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isValid;

        do{
            System.out.println("Enter your password: ");
            String password = sc.nextLine();

            isValid = isValidPassword(password);


        }while(!isValid);

        System.out.println("Thanks for entering a valid password.");

    }
}
