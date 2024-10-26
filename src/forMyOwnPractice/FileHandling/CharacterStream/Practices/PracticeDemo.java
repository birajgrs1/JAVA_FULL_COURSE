package forMyOwnPractice.FileHandling.CharacterStream.Practices;
import java.io.*;
import java.util.Scanner;

public class PracticeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();

        try(FileReader reader = new FileReader(fileName)) {
            int read;
            while((read = reader.read()) != -1) {
                System.out.println((char)read);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        catch (IOException e) {
            System.out.printf("Exception occured: %s", e.getMessage());
//            e.printStackTrace();
        }

    }
}
