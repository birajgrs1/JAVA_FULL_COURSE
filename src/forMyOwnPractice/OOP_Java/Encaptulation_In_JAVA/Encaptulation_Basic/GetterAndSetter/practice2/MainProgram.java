package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.Encaptulation_Basic.GetterAndSetter.practice2;

public class MainProgram {
    public static void main(String[] args) {
        Employee emp = new Employee("Ram Dahal", 30, 50000, "Developer");

        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Position: " + emp.getPosition());

        emp.setName("Shyam Khadka");
        emp.setAge(28);
        emp.setSalary(60000);
        emp.setPosition("Senior Developer");

        System.out.println("\n-------------------------\n");
        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Age: " + emp.getAge());
        System.out.println("Updated Salary: " + emp.getSalary());
        System.out.println("Updated Position: " + emp.getPosition());
    }
}
