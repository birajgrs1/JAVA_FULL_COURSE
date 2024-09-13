package forMyOwnPractice.OOP_Java.Abstraction_JAVA.AbstractionBasics.Basic1;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle(2);
        Car car = new Car(2);
        car.commute();
        car.makeStartSound();


    }
}
