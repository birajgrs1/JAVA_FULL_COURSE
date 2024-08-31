package forMyOwnPractice.OtherSpecialMethods.MathMethods;
import java.util.Random;

public class RandomClassDemo {
    public static void main(String[] args) {

//        Create instance of random class
        Random rand = new Random();

        //For integer value
        System.out.println("Random value(in integer): "+rand.nextInt());

        //for double (decimal)
        System.out.println("Random value(in decimal): "+rand.nextDouble());

        //for boolean
        System.out.println("Random value(in boolean): "+rand.nextBoolean());

        //for float
        System.out.println("Random value(in float): "+rand.nextFloat());

    }
}
