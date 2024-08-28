package forMyOwnPractice.OOP_Java.Constructor_Java.ParameterizedConstructors.ParameterizedDemo;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    // Parameterized Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Default Constructor
    Person(){
    }

    boolean compareAge(Person p){
        if(this.age > p.age)
            return true;
        else
            return false;
    }

    Person min(Person p){
        if(this.age < p.age)
            return this;
        else
            return p;
    }

    // Display
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize Person objects with default constructor
        Person p1 = new Person();
        Person p2 = new Person();

        // Assign values to Person objects
        System.out.print("Enter name and age for first person: ");
        p1.name = sc.next();
        p1.age = sc.nextInt();

        System.out.print("Enter name and age for second person: ");
        p2.name = sc.next();
        p2.age = sc.nextInt();

        boolean flag = p1.compareAge(p2);

        if(flag)
            System.out.println(p1.name + " is elder brother.");
        else
            System.out.println(p2.name + " is elder brother.");

        Person p = p1.min(p2);
        System.out.println("Person with minimum age: " + p.name + ", Age: " + p.age);

        sc.close();
    }
}
