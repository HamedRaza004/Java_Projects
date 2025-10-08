import java.util.*;
class Student {
    String name; int marks;
    Student(String n,int m){name=n;marks=m;}
    public String toString(){return name+"-"+marks;}
}
class SortStudent{
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("A",90), new Student("B",80));
        list.sort((s1,s2)->s2.marks-s1.marks);
        System.out.println(list);
    }
}
