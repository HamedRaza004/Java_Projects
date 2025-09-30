import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.add("Ravi Kumar");
        employeeNames.add("Priya Singh");
        employeeNames.add("Amit Patel");

        HashSet<String> departments = new HashSet<>();
        departments.add("Technology");
        departments.add("Human Resources");
        departments.add("Finance");
        departments.add("Technology");

        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Ravi Kumar");
        employeeMap.put(102, "Priya Singh");
        employeeMap.put(103, "Amit Patel");

        System.out.println("Employee Names:");
        for (String name : employeeNames) {
            System.out.println(name);
        }

        System.out.println("\nUnique Departments:");
        for (String department : departments) {
            System.out.println(department);
        }

        System.out.println("\nEmployee ID-Name Mappings:");
        for (Integer id : employeeMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employeeMap.get(id));
        }
    }
}
