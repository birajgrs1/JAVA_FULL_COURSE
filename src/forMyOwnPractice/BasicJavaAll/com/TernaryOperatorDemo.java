package forMyOwnPractice.BasicJavaAll.com;

import java.util.Scanner;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:::");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:::");
        int num2 = sc.nextInt();

        int maxNum;

        //Applying Ternary operator
        maxNum = num1 > num2 ? num1 : num2;

        System.out.println("Maximum number is " + maxNum);
    }
}
