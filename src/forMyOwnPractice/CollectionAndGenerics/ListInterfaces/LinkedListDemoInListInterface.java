package forMyOwnPractice.CollectionAndGenerics.ListInterfaces;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemoInListInterface {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<String>();

        linkedList.add("Ram");
        linkedList.add("Shyam");
        linkedList.add("Hari");
        linkedList.add("Sita");


        System.out.println(linkedList);
        System.out.println("First Element: " + linkedList.get(0));
        System.out.println("Last Element: " + linkedList.get(linkedList.size() - 1));
        linkedList.remove("Shyam");
        System.out.println("After removing Shyam: " + linkedList);

        //Using iteration over linked list
        for(String str : linkedList){
            System.out.println(str);
        }

    }
}
