package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice4;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 8, 9};
        ArrayOperations arrayOperations = new ArrayOperations(numbers);
        ArrayOperations.Statistics statistics = arrayOperations.new Statistics();

        double mean = statistics.mean();
        System.out.println("Mean: " + mean);

        double median = statistics.median();
        System.out.println("Median: " + median);
    }
}
