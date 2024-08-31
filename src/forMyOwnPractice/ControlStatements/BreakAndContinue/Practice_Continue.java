package forMyOwnPractice.ControlStatements.BreakAndContinue;

import java.util.Scanner;

/*
Create a program using continue to sum all positive numbers entered by the
user; skip any negative numbers.
 */
public class Practice_Continue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();


        if (n <= 0) {
            System.out.println("The number of elements must be positive.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int num : arr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }

        System.out.println("Sum of positive numbers: " + sum);
    }
}
