package forMyOwnPractice.ControlStatements.Looping.NestedLoopings;

public class NestedDemo1 {
    public static void main(String[] args) {

        //Outer loop
        for (int i = 0; i<3; i++){

            //Inner loop
            for(int j=0; j<2; j++){
                System.out.print(i+" "+j);
            }
            System.out.println();
        }
    }
}
