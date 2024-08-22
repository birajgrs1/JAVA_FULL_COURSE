package forMyOwnPractice.FunctionInJava.com.PracticeQuestions;

import java.util.Scanner;

public class CheckEligiblityForVoting {

    public static boolean isEligibleForVote(int age){
        return age >=18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(isEligibleForVote(age)){
            System.out.println("You are eligible for vote");
        }
        else {
            System.out.println("You are not eligible for vote");
        }
    }
}
