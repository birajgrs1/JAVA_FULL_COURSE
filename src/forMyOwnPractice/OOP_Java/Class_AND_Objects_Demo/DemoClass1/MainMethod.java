package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.DemoClass1;

// Main class to run the program
public class MainMethod {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person();

        // Accessing fields of the Person object and printing them
        System.out.println("Name of the person: " + person.name);
        System.out.println("Age of the person: " + person.age);

        //Calling the method of person class
        person.study();
        person.play();
    }
}
