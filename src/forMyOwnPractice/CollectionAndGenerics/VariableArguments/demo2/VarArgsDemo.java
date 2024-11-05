package forMyOwnPractice.CollectionAndGenerics.VariableArguments.demo2;

public class VarArgsDemo {

    public static void printNumbers(int... numbers){
        for(int number:numbers){
            System.out.print(number+" ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        printNumbers(1);
        printNumbers(2,3);
        printNumbers(3,4,5);
        printNumbers(4,5,6,7);
        printNumbers(5,6,7,8,9);
        printNumbers(6,7,8,9,10,11);

    }
}
