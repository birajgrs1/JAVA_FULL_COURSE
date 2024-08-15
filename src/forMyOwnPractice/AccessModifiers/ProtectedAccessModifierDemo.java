package forMyOwnPractice.AccessModifiers;

public class ProtectedAccessModifierDemo {

    // Protected variable
    protected int number = 42;

    // Protected method
    protected void display() {
        System.out.println("Protected method: " + number);
    }

    public static void main(String[] args) {

        // Creating an instance of the class
        ProtectedAccessModifierDemo demo = new ProtectedAccessModifierDemo();

        // Calling the protected method
        demo.display();
    }
}
