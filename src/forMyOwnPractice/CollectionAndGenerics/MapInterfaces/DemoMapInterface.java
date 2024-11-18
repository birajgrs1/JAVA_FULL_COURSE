package forMyOwnPractice.CollectionAndGenerics.MapInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding to map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Accessing
        System.out.println(map);

        Integer appleCount = map.get("Apple");
        System.out.println("Apples count: " + appleCount);

        // Checking if exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is in the map");
        }

        // Remove a key-value pair
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);

        // Adding more
        map.put("Cherry", 50);
        map.put("Jackfruit", 5);
        System.out.println(map);

        // getting entries from the map
        Set<Map.Entry<String, Integer>> setEntries = map.entrySet();

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : setEntries) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }
}
