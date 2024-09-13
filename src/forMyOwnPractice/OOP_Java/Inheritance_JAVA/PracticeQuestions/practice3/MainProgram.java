package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice3;

public class MainProgram {
    public static void main(String[] args) {
        Person p1 = new Person("Ram", 30);
        Person p2 = new Person("Ram", 30);
        Person p3 = new Person("Sita", 25);

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("p3.hashCode(): " + p3.hashCode());
    }

}
