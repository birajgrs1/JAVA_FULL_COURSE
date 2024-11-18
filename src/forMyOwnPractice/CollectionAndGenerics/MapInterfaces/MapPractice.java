package forMyOwnPractice.CollectionAndGenerics.MapInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("Nepal", "Kathmandu");
        countries.put("India", "New Delhi");
        countries.put("Bangladesh", "Dhaka");
        countries.put("Germany", "Berlin");
        countries.put("United States", "Washington, D.C.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the country: ");
        String name = sc.nextLine();

        if (countries.containsKey(name)) {
            System.out.println("The capital of " + name + " is " + countries.get(name));
        } else {
            System.out.println("Country not found in the map!");
        }

        sc.close();
    }
}
