package forMyOwnPractice.AccessModifiers;

// Public class with public access modifier
public class PublicAccessModifierDemo {

    // Public method
    public void display() {
        System.out.println("Public method");
    }

    public static void main(String[] args) {

        // Creating an instance of the public class
        PublicAccessModifierDemo demo = new PublicAccessModifierDemo();

        // Calling the public method
        demo.display();
    }
}
