import java.util.ArrayList;
import java.util.Collections;

public class StringSortDescending {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("John");
        names.add("Bob");
        names.add("Zara");

        Collections.sort(names, (a, b) -> b.compareTo(a));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
