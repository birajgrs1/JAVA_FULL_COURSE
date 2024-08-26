package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.DemoClass2;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    public void drive() {
        if(currentFuelInLitres <= 0) {
            System.out.println("Car is out of fuel!");
        } else if(currentFuelInLitres < 5) {
            System.out.println("Car is in reserved mode, please refuel!");
            currentFuelInLitres--;
        } else {
            System.out.println("Car is Driving.");
            currentFuelInLitres--;
        }
    }

    public void addFuel(float fuel) {
        currentFuelInLitres += fuel;
    }

    public float getCurrentFuelInLitres() {
        return currentFuelInLitres;
    }
}
