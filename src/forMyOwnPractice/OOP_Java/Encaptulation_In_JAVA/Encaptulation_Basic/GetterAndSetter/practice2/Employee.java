package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.Encaptulation_Basic.GetterAndSetter.practice2;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private String position;

    // Constructor
    public Employee(String name, int age, double salary, String position) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    // Getter and Setter for position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position != null && !position.trim().isEmpty()) {
            this.position = position;
        } else {
            System.out.println("Invalid position!");
        }
    }

}
