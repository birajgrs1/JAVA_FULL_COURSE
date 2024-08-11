package forMyOwnPractice.BasicJavaAll.com;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND operator
        System.out.println("a && b: " + (a && b)); // false

        // OR operator
        System.out.println("a || b: " + (a || b)); // true

        // NOT operator
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true
    }
}
