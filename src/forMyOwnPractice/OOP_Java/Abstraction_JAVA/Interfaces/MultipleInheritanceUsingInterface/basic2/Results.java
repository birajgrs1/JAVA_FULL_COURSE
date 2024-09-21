package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.MultipleInheritanceUsingInterface.basic2;

public class Results extends Test implements Sports {
    double total;

    public void showSportWt() {
        System.out.println("Sports Wt: " + sportWt);
    }

    void display() {
        total = part1 + part2 + sportWt;
        showData();
        showSportWt();
        System.out.println("Total Score = " + total);
    }

    public static void main(String[] args) {
        Results results = new Results();
        results.setData(12, 27.5, 56.0);
        results.display();
    }
}
