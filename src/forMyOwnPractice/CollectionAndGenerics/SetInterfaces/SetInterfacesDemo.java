package forMyOwnPractice.CollectionAndGenerics.SetInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfacesDemo {
    public static void main(String[] args) {

        /*
        Set<Integer> set = new HashSet<>();

        //adding
        set.add(10);
        set.add(20);
//        set.add(20);
//        set.add(10);
        set.add(30);
        System.out.println(set);

         */
//        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(19);
        set.add(11);
        System.out.println(set);


    }
}
