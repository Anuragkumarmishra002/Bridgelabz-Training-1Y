package Level1;
class Student{
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90)      return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public void displayDetails() {
        System.out.println("Student Name = " + name);
        System.out.println("Roll Number  = " + rollNumber);
        System.out.println("Marks        = " + marks);
        System.out.println("Grade        = " + calculateGrade());
    }
}

 class MainTest {
    public static void main(String[] args) {
        Student s1 = new Student("Dev     ", 301, 92.5);
        Student s2 = new Student("Rao", 302, 74.0);
        Student s3 = new Student("Rohit", 303, 45.0);

        System.out.println(" Student 1 ");
        s1.displayDetails();

        System.out.println("\nStudent 2 ");
        s2.displayDetails();

        System.out.println("\nStudent 3");
        s3.displayDetails();
    }
}