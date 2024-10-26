package forMyOwnPractice.ExceptionHandling;

public class TestFinally {
    public static void main(String[] args) {
        try {
            int div = 10/0;

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block always executed...");
        }
    }
}
