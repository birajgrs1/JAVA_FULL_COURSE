package forMyOwnPractice.CollectionAndGenerics.ListInterfaces;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        List<Integer> list = new Vector<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Vector elements: " + list);

        System.out.println("First element: " + list.get(0));

        list.remove(2);
        System.out.println("After removal: " + list);

        list.add(2, 6);
        System.out.println("After adding 6 at index 2: " + list);

        System.out.println("Size of the vector: " + list.size());

        System.out.println("Does the vector contain 4? " + list.contains(4));
        System.out.println("Does the vector contain 10? " + list.contains(10));

        list.clear();
        System.out.println("After clearing, vector elements: " + list);

        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println("Iterating through Vector:");
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
