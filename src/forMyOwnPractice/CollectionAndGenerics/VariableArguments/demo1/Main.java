package forMyOwnPractice.CollectionAndGenerics.VariableArguments.demo1;

import static forMyOwnPractice.CollectionAndGenerics.VariableArguments.demo1.MyClass.display;

public class Main {
    public static void main(String[] args) {
        display(); // 0 arg
        display("Hello");   // 1 arg
        display("Hello", "World!"); // 2 arg
        display("I", "am","Programmar"); // 3 arg

    }
}
