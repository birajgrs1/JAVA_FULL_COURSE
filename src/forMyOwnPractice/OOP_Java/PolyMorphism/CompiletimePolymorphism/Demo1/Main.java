package forMyOwnPractice.OOP_Java.PolyMorphism.CompiletimePolymorphism.Demo1;

public class Main {
    public static void main(String[] args) {
        Calculator calc  = new Calculator();

        //Adding 2 integers
        System.out.println("Adding 2 integers from method add: "+calc.add(2, 3));

        //Adding 3 integers
        System.out.println("Adding 3 integers from method add: "+calc.add(2, 3, 4));

        //Adding 2 double numbers
        System.out.println("Adding 2 double numbers from method add: "+calc.add(2.74, 3.25));
    }
}
