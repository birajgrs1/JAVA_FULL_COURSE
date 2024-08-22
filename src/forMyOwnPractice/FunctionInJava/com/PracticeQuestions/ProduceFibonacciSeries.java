package forMyOwnPractice.FunctionInJava.com.PracticeQuestions;

import java.util.Scanner;

public class ProduceFibonacciSeries {

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.println("0");
        if (n == 0) return;

        for (int i = 2; i <= n; i++) {
            System.out.println(second);
            int third = first + second;
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number up to which the series is printed:");
        int num = sc.nextInt();

        System.out.println("\n--------------Fibonacci Series----------------\n");
        printFibonacciSeries(num);
    }
}
