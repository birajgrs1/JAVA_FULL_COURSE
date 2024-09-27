package forMyOwnPractice.OOP_Java.PolyMorphism.CompiletimePolymorphism.Demo2;

public class Shapes {

    public void area(){
        System.out.println("Area of Shapes");
    }
    public void area(double radius){
        System.out.println("Area of Circle: "+Math.PI*radius*radius);
    }
    public void area(double breadth, double height){
        System.out.println("Area of Triangle: "+(0.5*breadth*height));
    }
    public void area(int length, int breadth){
        System.out.println("Area of Rectangle: "+length*breadth);
    }
}
