import java.util.*;
class SyncCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(list);
    }
}
