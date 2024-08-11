package forMyOwnPractice.BasicJavaAll.com;

public class WideningOrImplicitTypecasting {
    public static void main(String[] args) {

        int x=5;
        long y=x;
        float z=y;
        System.out.println("Before Typecast: "+x);
        System.out.println("After Typecast,long value: "+y);
        System.out.println("After Typecast,float value: "+z);

    }
}
