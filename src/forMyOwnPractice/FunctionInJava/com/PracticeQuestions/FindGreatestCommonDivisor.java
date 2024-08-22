package forMyOwnPractice.FunctionInJava.com.PracticeQuestions;

import java.util.Scanner;

public class FindGreatestCommonDivisor {

    public static int findGCD(int firstNumber, int secondNumber) {

        int gcd = 1;
        int i = 2;

        int least = least(firstNumber, secondNumber);

        while (i <= least) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int n1, int n2) {
        return Math.min(n1, n2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("The greatest common divisor is: " + gcd);
    }
}
