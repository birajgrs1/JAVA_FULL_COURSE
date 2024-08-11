package forMyOwnPractice.BasicJavaAll.com;

import java.util.Scanner;

public class CalculateCompoundInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Formula: A = P(1 + R/100)^t

        System.out.println("Enter the value of Principle (P): ");
        float principleAmount = sc.nextFloat();

        System.out.println("Enter the Rate (%): ");
        float rate = sc.nextFloat();

        System.out.println("Enter the time (years): ");
        float time = sc.nextFloat();

        double compoundInterest = principleAmount * Math.pow((1 + rate / 100), time);

        System.out.println("Compound Interest is: " + compoundInterest);
    }
}
