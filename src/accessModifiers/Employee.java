package accessModifiers;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated to Rs " + this.salary);
        } else {
            System.out.println("Invalid salary amount ");
        }
    }

    public void displayDetails() {
        System.out.println("Employee ID = " + employeeID);
        System.out.println("Department = " + department);
        System.out.println("Salary  Rs " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Manager ID =  " + employeeID);
        System.out.println("Department = " + department);
        System.out.println("Salary  Rs " + getSalary());
        System.out.println("Team Size  " + teamSize);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(401, "Engineering", 70000.00);

        System.out.println("\nEmployee Details ");
        emp.displayDetails();

        System.out.println("\nUpdating Salary ");
        emp.setSalary(75000.00);
        emp.setSalary(-5000.00);

        System.out.println("\nManager Details ");
        Manager mgr = new Manager(5001, "Product", 120000.00, 12);
        mgr.displayDetails();

        System.out.println("\n Updating Manager Salary ");
        mgr.setSalary(135000.00);
        System.out.println("Updated Manager Salary Rs " + mgr.getSalary());
    }
}