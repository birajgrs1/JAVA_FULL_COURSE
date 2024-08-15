package forMyOwnPractice.AccessModifiers;

public class DefaultAccessModifierDemo {

    // Method with default access modifier
    void display() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        int number;

        // Assigning value to the variable
        number = 42;
        System.out.println(number);

        // Creating an instance of DefaultAccessModifierDemo
        DefaultAccessModifierDemo demo = new DefaultAccessModifierDemo();

        // Calling the display method
        demo.display();
    }
}
