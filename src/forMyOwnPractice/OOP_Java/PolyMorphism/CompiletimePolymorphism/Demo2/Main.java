package forMyOwnPractice.OOP_Java.PolyMorphism.CompiletimePolymorphism.Demo2;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        shapes.area();
        shapes.area(10);
        shapes.area(10, 20);
        shapes.area(5.75, 4.35);
    }
}
