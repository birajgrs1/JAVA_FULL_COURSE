package forMyOwnPractice.ControlStatements.Looping.NestedLoopings;

public class NestedloopDemo3 {
    public static void main(String[] args) {

            for(int i = 1; i <= 10; i++) {

                for(int j = 1; j <= i; j++) {
                    System.out.print(" "+j);
                }
                System.out.println();
            }
    }
}