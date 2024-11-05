package forMyOwnPractice.CollectionAndGenerics.WrapperClass.Autoboxing.practice2;

public class WrpperClassesAutoboxingAndUnboxingDemo {
    public static void main(String[] args) {
        // Autoboxing example
        int primitiveInt = 5;
        Integer boxedInt = primitiveInt;  // Autoboxing: int to Integer
        System.out.println("Autoboxed Integer: " + boxedInt);

        // Unboxing example
        Integer wrapperInt = 10;
        int unboxedInt = wrapperInt;  // Unboxing: Integer to int
        System.out.println("Unboxed int: " + unboxedInt);

        // Using autoboxing and unboxing in calculations
        Integer num1 = 15;           // Autoboxing: int to Integer
        Integer num2 = 20;           // Autoboxing: int to Integer

        // Unboxing for addition
        int sum = num1 + num2;      // Unboxing: Integer to int for calculation
        System.out.println("Sum of unboxed integers: " + sum);
    }
}
