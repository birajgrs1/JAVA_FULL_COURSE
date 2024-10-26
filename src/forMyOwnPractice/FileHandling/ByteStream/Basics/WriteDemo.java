package forMyOwnPractice.FileHandling.ByteStream.Basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {

    public static void main(String[] args) {
        String text = "Hello World!!!\nHello Everyone.";  // Text to be written to the file

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\ByteStream\\Basics\\files\\demofile.txt")) {
            fos.write(text.getBytes());
            System.out.println("Text written to file successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
