package forMyOwnPractice.FunctionInJava.com.GreetingsDemo;

public class Greeting {
    public void greeting(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        //Calling the method
        Greeting greeting = new Greeting();
        greeting.greeting();

    }
}
