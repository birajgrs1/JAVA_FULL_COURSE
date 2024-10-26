package forMyOwnPractice.FileHandling.RandomAccessFile.practices;
import java.io.*;

public class RAFDemo {
    public static void main(String[] args) {
        try{
            // Create a new RandomAccessFile
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\biraj\\IdeaProjects\\JavaFullCourseBasicToAdvance\\src\\forMyOwnPractice\\FileHandling\\RandomAccessFile\\files\\raf.txt", "rw");

            raf.writeUTF("Hello World"); // Write something here
            raf.writeUTF("Hi");

            raf.seek(0);
            System.out.println(raf.readUTF());
            long pos = raf.getFilePointer();

            System.out.println("Current position is " + pos);
            System.out.println(raf.readUTF());
            raf.seek(0);
            System.out.println(raf.readUTF());
            raf.seek(13);
            System.out.println(raf.readUTF());
            raf.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
