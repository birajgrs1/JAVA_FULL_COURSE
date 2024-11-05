package forMyOwnPractice.CollectionAndGenerics.PracticeQuestions.practice5;

import java.util.Arrays;
import java.util.List;

class ReversedList {
    /*
    Create a program that reverses the elements of a List and prints the reversed list.
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Before reverse list: " + list);
        reverse(list);
        System.out.println("After Reversed: " + list);
    }

    public static void reverse(List<Integer> list) {
//        Collections.reverse(list);
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }
}
