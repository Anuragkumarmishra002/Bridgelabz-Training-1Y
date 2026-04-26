package com.gla.story_based;
class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    void display() {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name    = " + name);
        System.out.println("Marks   = " + marks);
        System.out.println("Grade   = " + calculateGrade());
    }
}

class EngineeringStudent extends Student {
    String branch;
    EngineeringStudent(int rollNo, String name, double marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }
    @Override
    void display() {
        // Append branch to student name using String concatenation
        String fullName = name + " (" + branch + ")";
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name    = " + fullName);
        System.out.println("Branch  = " + branch);
        System.out.println("Marks   = " + marks);
        System.out.println("Grade   = " + calculateGrade());
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Shivam", 85.5);
        EngineeringStudent es1 = new EngineeringStudent(2, "Anshu", 91.0, "Computer Science");

        System.out.println("|| Regular Student ||");
        s1.display();

        System.out.println("\n || Engineering Student ||");
        es1.display();

        // Polymorphism
        System.out.println("\n|| Polymorphism Demo || ");
        Student s2 = new EngineeringStudent(3, "Vishnu", 73.0, "Mechanical");
        s2.display();
    }
}
