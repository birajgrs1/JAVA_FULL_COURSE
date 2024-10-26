package forMyOwnPractice.FileHandling.CharacterStream.Basics;

import java.io.File;
public class FileDeleteDemo {
    public static void main(String[] args) {
        String file = "\"C:\\\\Users\\\\biraj\\\\IdeaProjects\\\\JavaFullCourseBasicToAdvance\\\\src\\\\forMyOwnPractice\\\\FileHandling\\\\CharacterStream\\\\Basics\\\\files\\\\newfile.txt";
        File file1 = new File(file);
        if (file1.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
