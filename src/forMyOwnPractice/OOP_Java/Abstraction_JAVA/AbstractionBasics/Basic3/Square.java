package forMyOwnPractice.OOP_Java.Abstraction_JAVA.AbstractionBasics.Basic3;

public class Square extends Shape {

    private  double sideInCms;

    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    public void setSideInCms(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms, 2);
    }
}
