package forMyOwnPractice.CollectionAndGenerics.PracticeQuestions.practice4;

import java.util.Arrays;
import java.util.List;

public class SwapInArrayLists {
    /*
    Write a method that swaps two elements in an ArrayList, given their indices.
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Before Swapping: " + list);
        swap(list,4,7);
        System.out.println("After Swapping"+ list);

    }
    public static void swap(List<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
    }
}
