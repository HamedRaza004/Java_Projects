// 3.Write a program to iterate over a List of integers using:
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        System.out.println("Iterating with a simple for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("\nIterating with an enhanced for loop:");
        for (Integer number : numbers) {
            System.out.println(number);
        }


        System.out.println("\nIterating with a while loop and Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
