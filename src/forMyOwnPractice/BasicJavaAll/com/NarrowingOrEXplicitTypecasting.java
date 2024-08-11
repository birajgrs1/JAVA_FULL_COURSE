package forMyOwnPractice.BasicJavaAll.com;

public class NarrowingOrEXplicitTypecasting {
    public static void main(String[] args) {
        double dbl = 5.5555;
        long lng= (long) dbl;   //Converting from double to long
        int i= (int) lng;       //Converting from long to int

        System.out.println("Before Converting: "+dbl);
        System.out.println("After converting, long value: "+lng);
        System.out.println("After converting, int value: "+i);
    }
}
