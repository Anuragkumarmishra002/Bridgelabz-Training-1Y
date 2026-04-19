package accessModifiers;
class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
            System.out.println("CGPA updated to = " + this.cgpa);
        } else {
            System.out.println("Invalid CGPA value ");
        }
    }

    public void displayDetails() {
        System.out.println("Roll Number =  " + rollNumber);
        System.out.println("Name =  " + name);
        System.out.println("CGPA  =  " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String researchTopic) {
        super(rollNumber, name, cgpa);
        this.researchTopic = researchTopic;
    }

    public void displayDetails() {
        System.out.println("Roll Number  =  " + rollNumber);
        System.out.println("Name         = " + name);
        System.out.println("CGPA          = " + getCgpa());
        System.out.println("Research Topic  = " + researchTopic);
    }
}

 class StudentMain {
    public static void main(String[] args) {
        Student s = new Student(21, "Shivam", 8.5);

        System.out.println(" Student Details ");
        s.displayDetails();

        System.out.println("\n Updating CGPA ");
        s.setCgpa(9.1);
        s.setCgpa(11.0);

        System.out.println("\n Postgraduate Student Details ");
        PostgraduateStudent pg = new PostgraduateStudent(31, "Anshu ", 9.2, "Machine Learning");
        pg.displayDetails();
    }
}