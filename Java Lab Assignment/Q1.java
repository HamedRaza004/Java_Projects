class Student {
    int id;
    String name;
    String course;

    public Student() {
        this.id = 0;
        this.name = "Unknown";
        this.course = "Unassigned";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.course = "Unassigned";
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(int id, String name, String course, String thesisTopic) {
        super(id, name, course);
        this.thesisTopic = thesisTopic;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "John Doe", "Computer Science");
        student1.displayDetails();
        System.out.println();
        GraduateStudent gradStudent = new GraduateStudent(201, "Jane Smith", "Master of Science", "AI in Healthcare");
        gradStudent.displayDetails();
    }
}
