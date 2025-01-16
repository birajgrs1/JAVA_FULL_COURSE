package forMyOwnPractice.seventh_sem_lab_all.lab3;

public class Rectangle implements Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        return length*breadth;
    }


}
