package forMyOwnPractice.OOP_Java.PolyMorphism.RuntimePolymorphism.Demo2;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
