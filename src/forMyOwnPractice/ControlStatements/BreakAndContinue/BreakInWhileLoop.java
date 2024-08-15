package forMyOwnPractice.ControlStatements.BreakAndContinue;

public class BreakInWhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }

    }
}
