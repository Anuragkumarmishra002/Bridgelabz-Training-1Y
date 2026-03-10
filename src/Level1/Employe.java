package Level1;




public class Employe {

    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employe e = new Employe();

        e.name = "Amit";
        e.id = 101;
        e.salary = 50000;

        e.display();
    }
}
