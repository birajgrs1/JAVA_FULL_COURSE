package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.Using_This_Keywords.Practice1;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    public Car start(){
        if(currentFuelInLitres <= 0) {
            System.out.println("Car is out of fuel!");
        }
        else if(currentFuelInLitres < 5) {
            System.out.println("Car is in reserved mode, please refuel!");
            currentFuelInLitres--;
        }
        else {
            System.out.println("Car is Started.");
            currentFuelInLitres--;
        }
        return this;

    }
    public void drive()
    {
        currentFuelInLitres--;
        System.out.println("Car is driving.");

    }

    public void addFuel(float fuel) {
        this.currentFuelInLitres += fuel;
    }

    public float getCurrentFuelInLitres() {
        return currentFuelInLitres;
    }
}
