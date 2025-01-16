package forMyOwnPractice.seventh_sem_lab_all.lab3;

public class TestInterface {
    public static void main(String[] args) {
        Circle circle = new Circle(10.4);
        Rectangle rectangle = new Rectangle(10.4, 8.6);

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
