package forMyOwnPractice.FileHandling.ByteStream.Basics;

import java.io.File;
import java.io.IOException;

public class CreateFilesDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\ByteStream\\Basics\\files\\demofile.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
