package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.demoInterfaces.basic2;

public class Circle implements Area {

    public float calculateArea(float radius, float unused) {
        return pi * radius * radius;
    }
}
