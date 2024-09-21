package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.MultipleInheritanceUsingInterface.basic4;

public class MainClass implements Readable, Writable, Storable {

    public void read(){
        System.out.println("Reading all datafiles...");
    }

    public void write(){
        System.out.println("Writing all datafiles...");
    }

    public void store(){
        System.out.println("Storing all datafiles...");
    }
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        obj.read();
        obj.write();
        obj.store();

    }
}
