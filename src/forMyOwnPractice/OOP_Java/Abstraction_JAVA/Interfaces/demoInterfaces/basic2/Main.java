package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.demoInterfaces.basic2;

public class Main {
    public static void main(String[] args) {
        Area rectangle = new Rectangle();
        Area circle = new Circle();

        System.out.println("Area of Rectangle is " + rectangle.calculateArea(10, 20));
        System.out.println("Area of Circle is " + circle.calculateArea(10, 0));
    }
}
