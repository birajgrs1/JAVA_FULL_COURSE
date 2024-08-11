package forMyOwnPractice.ControlStatements.DecisionMakingAndBranching;

import java.util.Scanner;

public class IfStatementDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println(num+" is Even.");
        }
        if(num % 2 != 0) {
            System.out.println(num+" is Odd.");
        }
    }
}
