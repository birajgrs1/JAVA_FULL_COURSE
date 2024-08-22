package forMyOwnPractice.ArraysInJava.ArrayIntroduction;

import java.util.Scanner;

public class FindSumOfAverage {
//    WAP to find sum and average of all elements in ar array.
    public static void main(String[] args) {
        int num, sum = 0;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in the array: ");
        num = sc.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter elements in the array: ");

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of elements: "+sum);
        average = (float)sum/num;
        System.out.println("Average of elements: "+average);




    }
}
