package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.Using_This_Keywords.Practice1;


public class Executor {
    public static void main(String[] args) {
        Car car = new Car();

        car.addFuel(8);
//        car.start();
//        car.drive();
        Car startedCar = car.start();
        startedCar.drive();

    }
}
