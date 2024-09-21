package forMyOwnPractice.OOP_Java.Abstraction_JAVA.AbstractionBasics.Basic3;

public class Circle extends Shape {

    private double radiusInCms;

    public Circle(double radius) {
        this.radiusInCms = radius;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    public void setRadiusInCms(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
