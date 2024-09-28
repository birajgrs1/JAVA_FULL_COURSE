package forMyOwnPractice.OOP_Java.PolyMorphism.PracticeExercise;

public class MainProgram {
    public static void main(String[] args) {
       Vehicle vehicle = new Vehicle();
       Car car = new Car();

       vehicle.service();
       car.service();
    }
}
