package forMyOwnPractice.FunctionInJava.com.ReturnStatementDemo;

public class ReturnStatementDemo {

    //num is a parameter
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        int input = 5;

        //input is an argument
        int result = square(input);

        System.out.println("Square of " + input + " is " + result);

    }
}
