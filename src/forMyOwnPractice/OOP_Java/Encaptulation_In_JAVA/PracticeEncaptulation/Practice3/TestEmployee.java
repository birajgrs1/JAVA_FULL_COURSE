package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.PracticeEncaptulation.Practice3;


public class TestEmployee {
    public static void main(String[] args) {
        Employee employee  = new Employee("Suresh Tamang", 30, 50000 );
        System.out.println(employee.getEmployeeDetails());
    }
}
