package forMyOwnPractice.FunctionInJava.com.Recursion;

import java.util.Scanner;
/*
. Create a program using recursion to check if a number is a palindrome using
recursion
 */

public class PalindromeNumbers{
    public static int reverseNumber(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        return reverseNumber(num / 10, reversed * 10 + num % 10);
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        return num == reverseNumber(num, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

    }
}
