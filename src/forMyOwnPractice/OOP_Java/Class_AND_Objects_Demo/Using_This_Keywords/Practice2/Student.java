package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.Using_This_Keywords.Practice2;

//Referring to Instance Variables
public class Student {
    private String name;
    private int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
