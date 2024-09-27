package forMyOwnPractice.OOP_Java.PolyMorphism.BasicTopics.SuperKeywords.Demo2;

public class Subclass extends SuperClass {
    int num2 = 20;

    void display(){
        super.display();   //Calling superclass method
        System.out.println("I am Sub class.");
    }

    Subclass(){
        super();  //Calling superclass constructor
        System.out.println("I am Sub class constructor.");
    }

    void displayNums(){
        System.out.println("First value in superclass: "+super.num1); // Accessing superclass variable using super keyword
        System.out.println("Second value in subclass: "+num2);

    }

}
