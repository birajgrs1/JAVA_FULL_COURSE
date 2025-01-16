package forMyOwnPractice.seventh_sem_lab_all.lab2;

public class Room {
    public double length;
    public double breadth;

    Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea(){
        return length * breadth;
    }
}
