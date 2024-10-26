package forMyOwnPractice.ExceptionHandling;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            int arr[]= new int[2];
            arr[2] = 30;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index: "+ e);
        }
        System.out.println("Statement after exception generating statement.....");
    }
}
