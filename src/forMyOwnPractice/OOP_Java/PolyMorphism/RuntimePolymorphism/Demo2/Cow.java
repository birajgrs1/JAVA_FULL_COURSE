package forMyOwnPractice.OOP_Java.PolyMorphism.RuntimePolymorphism.Demo2;

public class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow makes sound like: 'Moo!' ");
    }
}
