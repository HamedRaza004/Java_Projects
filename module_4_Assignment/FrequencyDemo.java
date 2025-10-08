import java.util.*;
class FrequencyDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","A","C","A");
        System.out.println(Collections.frequency(list, "A"));
    }
}
