package forMyOwnPractice.ExceptionHandling;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }

    public static void main(String[] args) {
        CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
        try {
            customExceptionDemo.checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}