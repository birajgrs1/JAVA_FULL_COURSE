package forMyOwnPractice.OOP_Java.Abstraction_JAVA.AbstractionBasics.Basic2;

abstract class Animal {
    public abstract void makeSound();   // Abstract method with no definition(doesnot have body)

    public void sleep(){
        System.out.println("Zzz...");
    }

}
