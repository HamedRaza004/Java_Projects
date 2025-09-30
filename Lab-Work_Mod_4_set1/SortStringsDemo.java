// 5.Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.
import java.util.ArrayList;
import java.util.Collections;

public class SortStringsDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        System.out.println("Original list: " + names);

        // Sort alphabetically
        Collections.sort(names);
        System.out.println("Sorted alphabetically: " + names);

        // Sort reverse alphabetically
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Sorted reverse alphabetically: " + names);
    }
}
