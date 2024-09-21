package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.demoInterfaces.basic3;

public class Main {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();
        piano.play();
    }
}
