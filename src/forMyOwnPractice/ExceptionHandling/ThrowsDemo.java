package forMyOwnPractice.ExceptionHandling;

public class ThrowsDemo {

    void divide(int a, int b) throws ArithmeticException{
        int div = a / b;
        System.out.println("Division by " + b + " is " + div);
    }

    public static void main(String[] args) {
       ThrowsDemo demo = new ThrowsDemo();
       try {
           demo.divide(10, 5);
           demo.divide(10,0);
       }
       catch (ArithmeticException e) {
           System.out.printf(e.getMessage());
       }
    }
}
