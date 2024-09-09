package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.PracticeEncaptulation.Practice3;

public class Employee {

    private String name;
    private int age;
    private double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    String getEmployeeDetails(){
        return "Employee Details: \n"+"Name: "+name+"\nAge: "+age+"\nSalary: "+salary;
    }
}
