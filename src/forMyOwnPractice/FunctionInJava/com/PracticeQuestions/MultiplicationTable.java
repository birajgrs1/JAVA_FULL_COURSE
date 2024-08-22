package forMyOwnPractice.FunctionInJava.com.PracticeQuestions;


import java.util.Scanner;

// Develop a program that prints the multiplication table for a given number.
public class MultiplicationTable {



    public static void printMultiplicationTable(int num) {
        int i =1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" \n ############### Welcome to Multiplication Table ################# \n");
        System.out.println("Please enter your number (any): ");
        int num = sc.nextInt();

        printMultiplicationTable(num);



    }
}
