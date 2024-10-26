package forMyOwnPractice.FileHandling.Serialization.practice2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializableDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        String filePath = "C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\Serialization\\files\\myObjects.txt";

        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            do {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter gender: ");
                String gender = scanner.nextLine();

                Person person = new Person(name, age, gender);

                out.writeObject(person);
                System.out.println("Serialized: " + person);

                System.out.print("Do you want to add another person? (yes/no): ");
                choice = scanner.nextLine();

            } while (choice.equalsIgnoreCase("yes"));

            System.out.println("Data has been serialized to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
