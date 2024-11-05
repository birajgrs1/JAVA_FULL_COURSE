package forMyOwnPractice.CollectionAndGenerics.WrapperClass.BasicWrapperClassesExample;

public class WrapperClassDemo {
    public static void main(String[] args) {

        Integer intWrapper = Integer.valueOf(10);
        Double doubleWrapper = Double.valueOf(15.5);
        Character charWrapper = Character.valueOf('A');

        System.out.println("Integer value: " + intWrapper.intValue());
        System.out.println("Double value: " + doubleWrapper.doubleValue());
        System.out.println("Character value: " + charWrapper.charValue());

        int intValue = intWrapper.intValue();
        double doubleValue = doubleWrapper.doubleValue();
        char charValue = charWrapper.charValue();

        System.out.println("Unwrapped Integer: " + intValue);
        System.out.println("Unwrapped Double: " + doubleValue);
        System.out.println("Unwrapped Character: " + charValue);
    }
}
