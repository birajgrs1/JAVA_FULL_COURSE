package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.UsingStaticMember_and_Methods_OOP.Practice1;

import java.util.Scanner;

public class Calculator {
    //Static variable (static member)
    static double pi = 3.1416;

    //Static method(s)
    static double calculateAreaOfCircle(double radius) {
        return pi * radius * radius;
    }
    static double calculateCircumferenceOfCircle(double radius) {
        return 2 * pi * radius;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        //Accessing static methods
        double area = Calculator.calculateAreaOfCircle(radius);
        double circumference = Calculator.calculateCircumferenceOfCircle(radius);

        //Display
        System.out.println("Radius of Circle: "+radius);
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);

    }
}
