package forMyOwnPractice.FileHandling.CharacterStream.Basics;
import java.io.*;
public class CreateAndWriteFilesDemo {
    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\CharacterStream\\Basics\\files\\demofile.txt";

        FileWriter fw = new FileWriter(file);
        fw.write("Hello World!");
        fw.close();
    }

}
