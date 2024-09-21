package forMyOwnPractice.OOP_Java.Abstraction_JAVA.AbstractionBasics.Basic3;

public class MainProgram {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        Square square = new Square(10);

        System.out.println("Area is circle :"+ circle.calculateArea());
        System.out.println("Area is square :"+ square.calculateArea());
    }
}
