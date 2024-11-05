package forMyOwnPractice.CollectionAndGenerics.VariableArguments.demo1;

public class MyClass {
    static void display(String... elememts){
        for(String str : elememts){
            System.out.println(str);
        }
    }
}
