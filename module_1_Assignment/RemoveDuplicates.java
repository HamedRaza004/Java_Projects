import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] original = {4, 5, 4, 2, 2, 3, 1, 5};

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : original) {
            set.add(num);
        }

        System.out.print("Array after removing duplicates: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
