package forMyOwnPractice.FileHandling.ByteStream.Basics;
import java.io.File;

public class DeletingFilesDemo {
    public static void main(String[] args) {
        File file = new File("C:\\\\Users\\\\biraj\\\\IdeaProjects\\\\JavaFullCourseBasicToAdvance\\\\src\\\\forMyOwnPractice\\\\FileHandling\\\\ByteStream\\\\Basics\\\\files\\\\demo.txt");
//        file.delete();

        if (file.exists()) {
            if(file.delete()) {
                System.out.println("File deleted successfully");
            }
            else{
                System.out.println("File could not be deleted");
            }
        }
        else{
            System.out.println("File does not exist");
        }


    }
}
