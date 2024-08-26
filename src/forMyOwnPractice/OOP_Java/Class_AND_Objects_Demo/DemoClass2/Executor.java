package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.DemoClass2;

public class Executor {

    public static void main(String[] args) {
        Car myCar = new Car();
//        myCar.addFuel(10);
//        myCar.drive();
//
//        myCar.addFuel(7);
//        myCar.drive();
//
//        myCar.addFuel(5);
//        myCar.drive();

        myCar.addFuel(3);
        myCar.drive();

        System.out.println("Show Current Fuel (in litres): " + myCar.getCurrentFuelInLitres());
    }
}
