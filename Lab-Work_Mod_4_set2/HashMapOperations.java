import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();


        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        System.out.println("Initial map: " + employeeMap);


        int keyToCheck = 102;
        if (employeeMap.containsKey(keyToCheck)) {
            System.out.println("\nKey " + keyToCheck + " exists in the map.");
        } else {
            System.out.println("\nKey " + keyToCheck + " does not exist in the map.");
        }


        System.out.println("\nIterating using KeySet:");
        for (Integer employeeId : employeeMap.keySet()) {
            System.out.println("Employee ID: " + employeeId + ", Name: " + employeeMap.get(employeeId));
        }

        System.out.println("\nIterating using EntrySet:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
