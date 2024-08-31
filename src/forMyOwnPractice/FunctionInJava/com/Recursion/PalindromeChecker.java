package forMyOwnPractice.FunctionInJava.com.Recursion;

import java.util.Scanner;

/*
. Create a program using recursion to check if a string is a palindrome using
recursion
 */

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to be checked: ");
        String str = sc.next();

        System.out.println("Your string is " + (isPalindrome(str) ? "Palindrome." : "Not a Palindrome."));
    }

    public static boolean isPalindrome(String str) {

        if (str.length() <= 1) {
            return true;
        }

        int lastPosition = str.length() - 1;

        if (str.charAt(0) != str.charAt(lastPosition)) {
            return false;
        }

        /*
        String newString = str.substring(1, lastPosition);
        return isPalindrome(newString);
        */
        return isPalindrome(str.substring(1, lastPosition));
    }
}


/*
racecar
madam
 */