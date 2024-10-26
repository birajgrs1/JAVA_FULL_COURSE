package forMyOwnPractice.FileHandling.CharacterStream.Basics;
import java.io.*;
public class FileReadWrite {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\CharacterStream\\Basics\\files\\hello.txt";
        FileWriter writer = new FileWriter(fileName);

        writer.write(" Hello Everyone, \t\n This is an example.");
        writer.close();


        FileReader reader = new FileReader(fileName);
        char [] a = new char[50];
        reader.read(a); // reads the content to the array.
        for(char c : a){
            System.out.print(c);
        }
        reader.close();
    }
}
