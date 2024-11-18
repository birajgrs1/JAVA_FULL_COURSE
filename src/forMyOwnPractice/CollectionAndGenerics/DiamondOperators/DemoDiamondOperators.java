package forMyOwnPractice.CollectionAndGenerics.DiamondOperators;

import java.util.ArrayList;
import java.util.List;

public class DemoDiamondOperators {
    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList<String>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Hari");

        for (String str : list) {
            System.out.println(str);
        }

         */
        /*
        List<String> list = new ArrayList<>(); //Generic and diamond operator
        list.add("Ram");
        list.add("Shyam");
        list.add("Hari");

        for (String str : list) {
            System.out.println(str);
        }

         */

        // Using own class

        OwnClass<String> obj = new OwnClass<String>("Ram");
        System.out.println(obj.getValue());

        OwnClass<Integer> intObj = new OwnClass<>(10);
        System.out.println(intObj.getValue());








    }
}
