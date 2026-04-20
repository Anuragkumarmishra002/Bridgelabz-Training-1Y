package streamapi;
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
 class FilterStudents {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Aman", 22),
                new Student(2, "Ravi", 19),
                new Student(3, "Neha", 25));
        list.stream().filter(s -> s.age > 20)
                .forEach(s -> System.out.println(s.name));
    }
}