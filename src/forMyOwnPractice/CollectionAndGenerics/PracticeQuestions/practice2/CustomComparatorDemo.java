package forMyOwnPractice.CollectionAndGenerics.PracticeQuestions.practice2;

import java.util.*;

public class CustomComparatorDemo {
    /*
    Write a program that sorts a list of String objects in descending order using a custom Comparator.
     */

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);  // Display sorted list
    }

    public static void sortInDescending(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);  // Changed for descending order
            }
        });
    }
}
