package forMyOwnPractice.OOP_Java.PolyMorphism.PracticeExercise;

public class Car extends Vehicle{
    @Override
    public void service(){
        super.service();
        System.out.println("Car is getting service");
    }
}
