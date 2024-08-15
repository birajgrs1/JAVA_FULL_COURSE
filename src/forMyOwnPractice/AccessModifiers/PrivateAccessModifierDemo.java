package forMyOwnPractice.AccessModifiers;

public class PrivateAccessModifierDemo {

    // Private variable
    private int number = 42;

    // Private method
    private void display() {
        System.out.println("Private method: " + number);
    }

    // Public method to access the private method and variable
    public void show() {
        display(); // Calling the private method within the class
    }

    public static void main(String[] args) {

        // Creating an instance of the class
        PrivateAccessModifierDemo demo = new PrivateAccessModifierDemo();

        // Attempting to call the private method directly would result in an error
        // demo.display(); // This line would cause a compile-time error

        // Instead, calling the public method that internally calls the private method
        demo.show();
    }
}
