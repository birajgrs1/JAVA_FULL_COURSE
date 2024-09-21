package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.demoInterfaces.basic1;

public class Car extends Vehicle {

    private int noOfDoors;

    public Car(int noOfTyres) {
        super(4);
    }



    @Override
    public void makeStartSound() {
        System.out.println("Vroom...");
    }


}
