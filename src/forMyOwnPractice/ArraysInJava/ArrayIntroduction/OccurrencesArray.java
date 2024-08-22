package forMyOwnPractice.ArraysInJava.ArrayIntroduction;

//Create a program to find number of occurrences of an element in an array.

import java.util.Scanner;

public class OccurrencesArray {

    public static int countOccurrences(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Input the array elements
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to count occurrences of
        System.out.print("Enter the element to find its occurrences: ");
        int element = sc.nextInt();

        // Count and display the number of occurrences
        int occurrences = countOccurrences(arr, element);
        System.out.println("The element " + element + " occurs " + occurrences + " times in the array.");
    }
}

