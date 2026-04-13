import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class FilterStudentsOver20 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Aman", 18),
                new Student(2, "Riya", 22),
                new Student(3, "Rahul", 25),
                new Student(4, "Neha", 19),
                new Student(5, "Karan", 21)
        );
        List<String> names = students.stream()
                .filter(s -> s.age > 20)
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}