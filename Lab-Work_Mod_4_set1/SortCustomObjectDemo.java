// 6.Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + "'" +
                ", marks=" + marks +
                '}';
    }
}
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}
public class SortCustomObjectDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));

        System.out.println("Unsorted list of students:");
        for (Student student : students) {
            System.out.println(student);
        }
        Collections.sort(students, new MarksComparator());
        System.out.println("\nSorted list of students by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
