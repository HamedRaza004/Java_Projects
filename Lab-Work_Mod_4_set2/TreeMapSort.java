import java.util.TreeMap;

public class TreeMapSort {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();


        treeMap.put("Banana", 3);
        treeMap.put("Apple", 1);
        treeMap.put("Orange", 2);
        treeMap.put("Grapes", 4);

        System.out.println("TreeMap (sorted by keys):");

        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
