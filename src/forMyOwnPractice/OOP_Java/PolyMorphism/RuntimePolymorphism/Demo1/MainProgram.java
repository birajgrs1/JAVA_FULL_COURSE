package forMyOwnPractice.OOP_Java.PolyMorphism.RuntimePolymorphism.Demo1;

public class MainProgram {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        Bike myBike = new Bike();

        myVehicle.move();
        myCar.move();
        myBike.move();
    }
}
