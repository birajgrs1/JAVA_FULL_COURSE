package forMyOwnPractice.ExceptionHandling;

public class MultipleCatchBlocksDemo {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[5] = 50/0;
        }
        catch(ArithmeticException e){
//            System.out.println("Division by zero"+ e.getMessage());
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e1){
//            System.out.println("Index out of bounds: "+e1.getMessage());
            System.out.println("Array index out of bounds");
        }
        System.out.println("Other codes also can applied....");
    }
}
