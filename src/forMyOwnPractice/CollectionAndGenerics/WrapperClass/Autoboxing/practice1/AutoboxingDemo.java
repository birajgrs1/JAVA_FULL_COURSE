package forMyOwnPractice.CollectionAndGenerics.WrapperClass.Autoboxing.practice1;

public class AutoboxingDemo {
    public static void main(String[] args) {
        int num = 10;

        // Explicit conversion
        Integer obj1 = Integer.valueOf(num);   // Integer wrapper class

        // Autoboxing
        Integer obj2 = num;
        System.out.println("Autoboxing integer obj value : " + obj2);

        // Unboxing
        int num2 = obj2.intValue(); // Explicit unboxing
        System.out.println("Unboxing explicit value : " + num2);

        int num3 = obj2; // Implicit unboxing
        System.out.println("Unboxing implicit value : " + num3);
    }
}
