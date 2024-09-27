package forMyOwnPractice.OOP_Java.PolyMorphism.BasicTopics.SuperKeywords.Demo1;

public class Dog extends Animal {
    String name = "Dog";  // Subclass variable

    // Subclass constructor
    public Dog(String name) {
        super(name);  // Calling the superclass constructor
        System.out.println("Dog's Constructor: Name is " + this.name);
    }

    // Overriding the sound method from the Animal class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void displayNames() {
        System.out.println("Subclass name: " + name);          // Refers to the subclass variable
        System.out.println("Superclass name: " + super.name);  // Refers to the superclass variable
    }

    public void callSuperSound() {
        super.sound();  // Calls the superclass method (Animal's sound method)
    }
}