package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.PracticeEncaptulation.Practice1.example.utils;

//import forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.PracticeEncaptulation.Practice1.example.geometry.*;

import forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.PracticeEncaptulation.Practice1.example.geometry.Circle;
import forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.PracticeEncaptulation.Practice1.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(7.5);
        Rectangle rect = new Rectangle(10,6);

        double areaOfCircle =  Math.PI*Math.pow(circle.radius, 2);
        double areaOfRectangle = rect.length*rect.length;

        System.out.println("Area of Circle: " + areaOfCircle);
        System.out.println("Area of Rectangle: " + areaOfRectangle);
    }
}
