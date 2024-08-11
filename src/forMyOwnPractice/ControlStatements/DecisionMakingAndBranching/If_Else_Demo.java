package forMyOwnPractice.ControlStatements.DecisionMakingAndBranching;

import java.util.Scanner;

public class If_Else_Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+" is odd");
        }
    }
}
