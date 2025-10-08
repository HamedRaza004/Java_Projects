import java.util.*;
class ShuffleSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,8,1);
        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);
        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}
