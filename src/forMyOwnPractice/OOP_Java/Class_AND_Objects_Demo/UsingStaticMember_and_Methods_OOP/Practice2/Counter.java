package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.UsingStaticMember_and_Methods_OOP.Practice2;

public class Counter {
    // Static variable (class variable)
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
