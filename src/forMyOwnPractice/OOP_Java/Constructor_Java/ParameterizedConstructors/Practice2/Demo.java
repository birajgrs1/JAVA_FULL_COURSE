package forMyOwnPractice.OOP_Java.Constructor_Java.ParameterizedConstructors.Practice2;

public class Demo {
    int x;

    public Demo(int value){
        x = value;
    }
    public static void main(String[] args) {
        Demo demo = new Demo(10);
        System.out.println(demo.x);
    }

}
