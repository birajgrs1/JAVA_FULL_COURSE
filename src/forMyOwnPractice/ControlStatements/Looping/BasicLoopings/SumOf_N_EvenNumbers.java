package forMyOwnPractice.ControlStatements.Looping.BasicLoopings;

//Write a program to sum first n even numbers using a while loop.

import java.util.Scanner;

public class SumOf_N_EvenNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        int sum = 0;
        int num =2;
        int count = 0;

        while(count < n){
            sum += num;
            num +=2;
            count++;
        }
        System.out.println("Sum of first "+ n+"even numbers: " + sum);
    }
}
