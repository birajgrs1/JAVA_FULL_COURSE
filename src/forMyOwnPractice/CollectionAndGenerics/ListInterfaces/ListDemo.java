package forMyOwnPractice.CollectionAndGenerics.ListInterfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //creating list
        List<String> list = new ArrayList<String>();

        //Adding to lists
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");
        list.add("Pineapple");
        list.add("Orange");


        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.remove("Apple"));
        System.out.println(list);

    }
}
