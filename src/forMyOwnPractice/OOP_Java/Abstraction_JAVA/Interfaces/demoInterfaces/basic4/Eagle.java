package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.demoInterfaces.basic4;

public class Eagle extends Bird {

    @Override
    public void fly() {
        System.out.println("Eagle is flying...");
    }

    public Eagle(){
        super("Eagle");
    }
}
