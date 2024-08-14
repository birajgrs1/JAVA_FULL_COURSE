package forMyOwnPractice.ControlStatements.Looping.BasicLoopings;

import java.util.Scanner;

//Write a program to print the multiplication table of a given number n
public class Multiplication_Table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number n: ");
        int n = input.nextInt();


        System.out.println("Multiplication of " + n + " is: ");

        for (int i = 1; i <= n; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }


    }
}
