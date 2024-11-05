package forMyOwnPractice.CollectionAndGenerics.PracticeQuestions.practice3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Use the Collections class to count the frequency of a particular element in an ArrayList.
class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 6, 7, 8, 7, 8, 1, 2, 3);

        System.out.println(Collections.frequency(list, 3));
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 7));
    }

}
