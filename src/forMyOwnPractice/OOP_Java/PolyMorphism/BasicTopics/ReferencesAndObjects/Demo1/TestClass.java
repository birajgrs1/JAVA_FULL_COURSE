package forMyOwnPractice.OOP_Java.PolyMorphism.BasicTopics.ReferencesAndObjects.Demo1;

public class TestClass {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
        castTest(v);     // Vehicle object passed
        castTest(c);     // Car object passed

        Vehicle vCar = new Car();           // Upcasting
//        Car cVehicle = new Vehicle();      // Gives compile time error (not allowed)
//        Car cVehicle = (Car) new Vehicle();// Causes runtime ClassCastException
//        Object ref = new Vehicle();        // Upcasting to Object (valid)
    }

    private static void castTest(Vehicle vech) {
        vech.start();

        if (vech instanceof Car) {
            Car cVehicle = (Car) vech;
            cVehicle.start();
            System.out.println("Number of doors: " + cVehicle.noOfDoors());
        } else {
            System.out.println("The object is not a Car");
        }
    }
}

/*
1. Upcasting:
• Converts subclass to superclass reference.
• Automatic and safe.
• Access only to superclass methods.
2. Downcasting:
• Converts superclass to subclass reference.
• Manual and risky, needs instanceof check.
• Access to subclass-specific methods.
 */
