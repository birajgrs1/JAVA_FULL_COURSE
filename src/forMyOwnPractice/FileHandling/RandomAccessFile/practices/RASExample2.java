package forMyOwnPractice.FileHandling.RandomAccessFile.practices;

import java.io.*;

public class RASExample2 {

    static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to write student data to the file
        public void writeToFile(RandomAccessFile raf) throws IOException {
            raf.writeUTF(name);
            raf.writeInt(age);
        }

        // Static method to read student data from the file
        public static Student readFromFile(RandomAccessFile raf) throws IOException {
            String name = raf.readUTF();
            int age = raf.readInt();
            return new Student(name, age);
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + '}';
        }
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\RandomAccessFile\\files\\student.dat";

        // Writing to the file
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            Student stu1 = new Student("Ram", 20);
            Student stu2 = new Student("Shyam", 22);
            Student stu3 = new Student("Hari", 23);

            // Write student data to the file
            stu1.writeToFile(raf);
            stu2.writeToFile(raf);
            stu3.writeToFile(raf);

            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from the file
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            System.out.println("Reading data from the file:");
            while (raf.getFilePointer() < raf.length()) {
                Student student = Student.readFromFile(raf);
                System.out.println(student);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
