// 4.Create a List of strings and perform the following operations:
import java.util.ArrayList;
import java.util.List;

public class ListOperationsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial list: " + list);


        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);


        list.add("Date");
        list.add("Elderberry");
        System.out.println("List before replacement: " + list);
        list.set(1, "Fig");
        System.out.println("After replacing element at index 1: " + list);
    }
}
