package forMyOwnPractice.ControlStatements.DecisionMakingAndBranching;

import java.util.Scanner;

public class If_Else_ladder_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        if(num > 0 ){
            System.out.println(num+" is greater than zero or positive");
        }
        else if(num < 0 ){
            System.out.println(num+" is less than zero or negative");
        }
        else{
            System.out.println(num+" number is zero");
        }
    }
}
