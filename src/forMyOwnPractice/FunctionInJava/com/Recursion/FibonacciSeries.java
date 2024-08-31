package forMyOwnPractice.FunctionInJava.com.Recursion;

import java.util.Scanner;

/*
Create a program using recursion to display the Fibonacci series up to a certain number
 */
public class FibonacciSeries {

    public static int findFibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements to be printed: ");
        int nums = sc.nextInt();

        for (int i = 0; i < nums; i++) {
            System.out.print(findFibonacci(i) + " ");
        }

        sc.close();
    }
}
