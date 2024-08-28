package forMyOwnPractice.OOP_Java.Constructor_Java.DefaultConstructors.DefaultPractice1;

public class Demo {

    int x;

    public Demo(){
        x =10;
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.x);

    }
}
