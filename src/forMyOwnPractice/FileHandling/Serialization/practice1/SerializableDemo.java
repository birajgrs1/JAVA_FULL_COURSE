package forMyOwnPractice.FileHandling.Serialization.practice1;
import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ramesh", 31, "IT");
        Employee emp2 = new Employee("Suneeta", 27, "HR");


        try{
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\Serialization\\files\\employee.doc");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

            out.writeObject(emp1);
            out.writeObject(emp2);
            out.close();
            System.out.println("Serialized employee document");

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
