package forMyOwnPractice.BasicJavaAll.com;

import java.util.Scanner;

public class ArithmeticOperatorsDEmo {
/*
    Create a program that takes two numbers and shows result of all
    arithmetic operators (+,-,*,/,%).

 */
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number:");
    double num1=sc.nextDouble();

    System.out.println("Enter second number:");
    double num2=sc.nextDouble();


//    Applying all arithmetic operations
    double addition=num1+num2;
    double subtraction = num1-num2;
    double multiplication = num1*num2;
    double division =num1/num2;
    double modulo= num1%num2;

    System.out.println("Addition of two numbers: "+addition);
    System.out.println("Subtraction of two numbers: "+subtraction);
    System.out.println("Multiplication of two numbers: "+multiplication);
    System.out.println("Division of two numbers: "+division);
    System.out.println("Modulo of two numbers: "+modulo);



}
}
