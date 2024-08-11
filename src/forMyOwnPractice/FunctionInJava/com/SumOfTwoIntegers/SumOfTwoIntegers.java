package forMyOwnPractice.FunctionInJava.com.SumOfTwoIntegers;
import java.util.Scanner;

/*
Write a program with a method named getTotal that accepts two integers as an argument and return
 its sum. Call this method from main( ) and print the results.
 */

public class SumOfTwoIntegers {

    public int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();
        int sum = sumOfTwoIntegers.getTotal(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum+".");
    }
}
