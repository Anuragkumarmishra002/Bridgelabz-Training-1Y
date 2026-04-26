package com.gla.javaPackages.collage;

import com.gla.javaPackages.college.student.Student;
import com.gla.javaPackages.college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Shivam", 5);
        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");

        System.out.println("Student Details");
        s1.displayStudent();

        System.out.println("\n Faculty Details ");
        f1.displayFaculty();
    }
}