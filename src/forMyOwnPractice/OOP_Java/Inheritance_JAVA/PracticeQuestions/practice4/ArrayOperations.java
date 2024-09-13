package forMyOwnPractice.OOP_Java.Inheritance_JAVA.PracticeQuestions.practice4;

import java.util.Arrays;

public class ArrayOperations {

    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics {
        double mean() {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }

        double median() {
            int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
            Arrays.sort(sortedNumbers);

            int length = sortedNumbers.length;
            if (length % 2 == 1) {
                return sortedNumbers[length / 2];
            } else {
                return (sortedNumbers[(length / 2) - 1] + sortedNumbers[length / 2]) / 2.0;
            }
        }
    }
}
