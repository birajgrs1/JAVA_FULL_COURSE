package forMyOwnPractice.ControlStatements.Looping.BasicLoopings;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do
        {
            System.out.print("Enter the number ");
            int num = sc.nextInt();

            if( num % 2 == 0)
            {
                evenSum += num;
            }
            else
            {
                oddSum += num;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
