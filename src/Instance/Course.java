package Instance;
class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "BridgeLabz";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute = " + instituteName);
        System.out.println("Course    = " + courseName);
        System.out.println("Duration  = " + duration + " weeks");
        System.out.println("Fee       = Rs " + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to = " + instituteName);
    }
}

class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 12000.00);
        Course c2 = new Course("Python Basics", 6, 9000.00);

        System.out.println("\nCourse 1 Detailsm");
        c1.displayCourseDetails();

        System.out.println("\n Course 2 Details ");
        c2.displayCourseDetails();

        System.out.println("\n Updating Institute Name ");
        Course.updateInstituteName("CodInClub");

        System.out.println("\n Course 1 After Update ");
        c1.displayCourseDetails();

        System.out.println("\n Course 2 After Update ");
        c2.displayCourseDetails();
    }
}