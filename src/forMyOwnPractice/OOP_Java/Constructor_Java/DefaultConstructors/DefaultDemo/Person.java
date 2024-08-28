package forMyOwnPractice.OOP_Java.Constructor_Java.DefaultConstructors.DefaultDemo;

public class Person {

    String name;
    int age;


    //Default constructor
    Person(){
        name = "Ram Dahal";
        age = 18;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();

    }
}
