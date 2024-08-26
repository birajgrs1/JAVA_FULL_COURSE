package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.AreaOfRectangle;

import java.util.Scanner;

public class Rectangle {
    int length, breadth;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextInt();

        System.out.print("Enter the breadth: ");
        breadth = sc.nextInt();
    }

    void displayArea(){
        int area;
        area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }
}
