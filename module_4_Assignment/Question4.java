import java.util.ArrayList;
import java.util.List;

// 4.Create a List of strings and perform the following operations:
public class Question4 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // a. Add elements to the list.
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("Initial list: " + fruits);

        System.out.println("\n-----------------------------------\n");

        // b. Remove an element by value and index.
        // Remove by value
        fruits.remove("Banana");
        System.out.println("After removing 'Banana' by value: " + fruits);

        // Remove by index
        fruits.remove(1); // Removes "Cherry" which is now at index 1
        System.out.println("After removing element at index 1: " + fruits);

        System.out.println("\n-----------------------------------\n");

        // c. Replace an element at a specific index.
        fruits.set(0, "Apricot"); // Replaces "Apple" with "Apricot"
        System.out.println("After replacing element at index 0: " + fruits);

        System.out.println("\n-----------------------------------\n");

        // d. Print the list after each operation (already done above).
        System.out.println("Final list: " + fruits);
    }
}