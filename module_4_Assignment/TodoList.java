import java.util.*;
class TodoList {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Study"); tasks.add("Code");
        tasks.remove("Study");
        tasks.forEach(System.out::println);
    }
}
