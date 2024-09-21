package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.MultipleInheritanceUsingInterface.basic2;

public class Test {
    int rollNo;
    double part1, part2;

    void setData(int rollNo, double part1, double part2) {
        this.rollNo = rollNo;
        this.part1 = part1;
        this.part2 = part2;
    }

    void showData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks Obtained:");
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
    }
}
