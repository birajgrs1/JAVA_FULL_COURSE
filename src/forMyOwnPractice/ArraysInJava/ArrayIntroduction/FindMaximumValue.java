package forMyOwnPractice.ArraysInJava.ArrayIntroduction;

import java.util.Scanner;

/*
Create a program using for-each to find the maximum value in an integer array based on user input.
 */

public class FindMaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        System.out.println("The maximum value in the array is: " + maxValue);
    }
}
