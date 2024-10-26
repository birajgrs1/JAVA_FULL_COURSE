package forMyOwnPractice.FileHandling.CharacterStream.Basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTheFiles {
    public static void main(String[] args) {
        String file = "C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\CharacterStream\\Basics\\files\\demofile.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
