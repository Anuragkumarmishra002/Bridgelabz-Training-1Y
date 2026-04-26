package com.gla.story_based;
class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    String generateEmail() {

        return name.toLowerCase() + "@company.com";
    }

    void display() {
        System.out.println("Emp ID  = " + empId);
        System.out.println("Name    = " + name);
        System.out.println("Email   = " + generateEmail());
    }
}

class Manager extends Employee {
    String department;
    Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }
    @Override
    String generateEmail() {
        // Format: name@department.company.com
        return name.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
    }
    @Override
    void display() {
        System.out.println("Emp ID     = " + empId);
        System.out.println("Name       = " + name);
        System.out.println("Department = " + department);
        System.out.println("Email      = " + generateEmail());
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(301, "Shivam");
        Manager m1 = new Manager(302, "Anshu", "HR");

        System.out.println(" Employee ");
        e1.display();

        System.out.println("\n Manager ");
        m1.display();

        // Polymorphism
        System.out.println("\nPolymorphism Demo ");
        Employee e2 = new Manager(303, "Amit Singh", "Finance");
        System.out.println("Email via parent ref =" + e2.generateEmail());
    }
}
