package forMyOwnPractice.FunctionInJava.com.MethodParametersAndArgumentsDemo;

public class MethodParametersAndArguments {

    //num is a parameter
    public static void square(int num) {
        System.out.println("Square of " + num + " is " + (num * num));
    }

    public static void main(String[] args) {

        int input = 5;

        //input is an argument
        square(input);

    }
}
