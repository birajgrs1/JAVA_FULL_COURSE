package forMyOwnPractice.FunctionInJava.com.PracticeQuestions;

//Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class SumAllOddNumbers {

    public static int printAllOddSum(int num) {
        int i= 1;
        int sum = 0;
        while (i <= num) {
//            sum = sum + i;
            sum +=i;

            i+=2;

        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        int sum = printAllOddSum(num);

        System.out.println("OddSum till "+ num +" is "+sum);


    }
}
