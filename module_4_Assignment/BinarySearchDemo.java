import java.util.*;
class BinarySearchDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        int pos = Collections.binarySearch(list, 7);
        System.out.println("Index of 7: " + pos);
    }
}
