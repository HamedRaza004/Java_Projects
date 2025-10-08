import java.util.*;
class StudentGrades {
    public static void main(String[] args) {
        TreeMap<String,Integer> grades=new TreeMap<>();
        grades.put("Alice",90);
        grades.put("Bob",85);
        grades.remove("Bob");
        System.out.println(grades.get("Alice"));
    }
}
