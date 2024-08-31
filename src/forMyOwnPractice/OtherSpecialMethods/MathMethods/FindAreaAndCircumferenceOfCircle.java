package forMyOwnPractice.OtherSpecialMethods.MathMethods;

import java.util.Scanner;

/*
Calculate the area and circumference of a circle for a given radius
using Math.PI
 */

public class FindAreaAndCircumferenceOfCircle {

    double radiusInMm;

    FindAreaAndCircumferenceOfCircle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
        return 2*Math.PI*radiusInMm;
    }
    double getArea(){
        return Math.PI*Math.pow(radiusInMm,2);
    }

    @Override
    public String toString() {
        return "Circle Props: \n" +
                "Radius in mm: " + radiusInMm + "\n" +
                "Circumference in mm: " + getCircumference() + "\n" +
                "Area in mm²: " + getArea();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius in mm: ");
        double radiusInMm = sc.nextDouble();

        FindAreaAndCircumferenceOfCircle circle = new FindAreaAndCircumferenceOfCircle(radiusInMm);
        System.out.println(circle);

    }
}
