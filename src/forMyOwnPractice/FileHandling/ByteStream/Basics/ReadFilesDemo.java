package forMyOwnPractice.FileHandling.ByteStream.Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFilesDemo {

    public static void main(String[] args) throws FileNotFoundException {

        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\ByteStream\\Basics\\files\\demofile.txt")) {
            int files;
            while ((files = inputStream.read()) != -1) {
                System.out.print((char) files);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
