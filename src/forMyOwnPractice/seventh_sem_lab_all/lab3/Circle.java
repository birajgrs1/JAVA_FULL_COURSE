package forMyOwnPractice.seventh_sem_lab_all.lab3;

public class Circle implements Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }
}
