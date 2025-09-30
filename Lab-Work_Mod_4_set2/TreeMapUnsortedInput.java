import java.util.TreeMap;

public class TreeMapUnsortedInput {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(5, "Five");
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        System.out.println("TreeMap with unsorted input:");

        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
