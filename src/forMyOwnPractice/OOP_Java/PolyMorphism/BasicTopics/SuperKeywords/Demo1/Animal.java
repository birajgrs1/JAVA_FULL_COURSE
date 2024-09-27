package forMyOwnPractice.OOP_Java.PolyMorphism.BasicTopics.SuperKeywords.Demo1;

public class Animal {
    String name;   // Superclass variable

    //Superclass constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal's constructor: Name: " + name);
    }

    //Superclass method
    public void sound(){
        System.out.println("Animal makes a sound.");
    }
}
