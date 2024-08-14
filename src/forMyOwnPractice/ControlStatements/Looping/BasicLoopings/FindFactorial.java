package forMyOwnPractice.ControlStatements.Looping.BasicLoopings;


import java.util.Scanner;

//Write a program to find the factorial of a given number using for loops
public class FindFactorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any positive integer: ");
        int n = input.nextInt();

        long  factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);


    }
}
