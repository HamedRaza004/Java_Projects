
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 6.Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + "'" +
                ", marks=" + marks +
                '}';
    }
}

class SortByMarks implements Comparator<Student> {
    // Used for sorting in ascending order of marks
    public int compare(Student a, Student b) {
        return a.marks - b.marks;
    }
}

public class Question6 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        students.add(new Student("David", 92));
        students.add(new Student("Eve", 85));

        System.out.println("Original list of students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort students by marks in ascending order using the custom Comparator
        Collections.sort(students, new SortByMarks());

        System.out.println("\nList of students sorted by marks (ascending):");
        for (Student s : students) {
            System.out.println(s);
        }

        // To sort in descending order, we can use the reversed() method of the comparator
        Collections.sort(students, new SortByMarks().reversed());
        System.out.println("\nList of students sorted by marks (descending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
