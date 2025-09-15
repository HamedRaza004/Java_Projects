
import java.util.ArrayList;
import java.util.Collections;

// 5.Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.
public class Question5 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("London");
        cities.add("Paris");
        cities.add("Beijing");

        System.out.println("Original list: " + cities);

        // Sort alphabetically
        Collections.sort(cities);
        System.out.println("Sorted alphabetically: " + cities);

        // Sort in reverse alphabetical order
        Collections.sort(cities, Collections.reverseOrder());
        System.out.println("Sorted in reverse alphabetical order: " + cities);
    }
}
