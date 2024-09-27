package forMyOwnPractice.OOP_Java.PolyMorphism.BasicTopics.ReferencesAndObjects.Demo2;

public class MainProgram {
    public static void main(String[] args) {

        //Upcasting
        Parent p = new Child();
        p.name = "Ram Dahal";


        System.out.println(p.name);
        p.show();

        //Downcasting (Explicitly)
        Child c = new Child();
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.show();


    }
}
