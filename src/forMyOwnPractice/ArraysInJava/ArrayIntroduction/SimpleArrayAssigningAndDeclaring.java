package forMyOwnPractice.ArraysInJava.ArrayIntroduction;

public class SimpleArrayAssigningAndDeclaring {

    public static void main(String[] args) {
          /*
    Syntax:
    type var-name[];
    or type[] var-name;
     */

        //Defining the array
        int[] arr;
        arr = new int[5];
//       int arr[] ={10,20,30,40,50};

        //Assigning(another way) and declaring the arrays
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

//        Display
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

    }
}
