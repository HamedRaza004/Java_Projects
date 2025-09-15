import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 3.Write a program to iterate over a List of integers using:
public class Question3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // a. A simple for loop
        System.out.println("Iterating with a simple for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }

        System.out.println("\n-----------------------------------\n");

        // b. An enhanced for loop
        System.out.println("Iterating with an enhanced for loop:");
        for (Integer number : numbers) {
            System.out.println("Element: " + number);
        }

        System.out.println("\n-----------------------------------\n");

        // c. A while loop with an Iterator
        System.out.println("Iterating with a while loop and an Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}