package forMyOwnPractice.ControlStatements.Looping.BasicLoopings;

import java.util.Scanner;

/*
Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

 */
public class SumOfSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;  // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++)
        {
            sum += 1.0/i;
        }

        System.out.println("sum: " + sum);


    }
}
