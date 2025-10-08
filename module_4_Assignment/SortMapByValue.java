import java.util.*;
class SortMapByValue {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",3,"B",1,"C",2);
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
