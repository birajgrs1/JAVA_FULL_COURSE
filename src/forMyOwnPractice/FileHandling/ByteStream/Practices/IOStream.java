package forMyOwnPractice.FileHandling.ByteStream.Practices;

import java.io.*;

public class IOStream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\ByteStream\\Basics\\files\\input.txt");
            out = new FileOutputStream("C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\ByteStream\\Basics\\files\\input.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        finally {
            in.close();
            out.close();
        }
    }
}
