import java.util.*;
class UnmodifiableDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A","B"));
        List<String> unmod = Collections.unmodifiableList(list);
        unmod.add("C"); // Throws UnsupportedOperationException
    }
}
