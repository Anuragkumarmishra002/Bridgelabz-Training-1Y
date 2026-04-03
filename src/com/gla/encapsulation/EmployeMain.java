package com.gla.encapsulation;

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    Employee(int employeeId,String name,double baseSalary) {
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId=employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary=baseSalary;
    }
    abstract double calculateSalary();
    void displayDetails() {
        System.out.println("Employee ID "+employeeId);
        System.out.println("Name "+name);
        System.out.println("Base Salary "+baseSalary);
    }
}
class FullTimeEmployee extends Employee implements Department {
    private String department;
    FullTimeEmployee(int id,String name,double salary) {
        super(id,name,salary);
    }
    public double calculateSalary() {
        return getBaseSalary();
    }
    public void assignDepartment(String dept) {
        department=dept;
    }
    public String getDepartmentDetails() {
        return department;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department "+department);
        System.out.println("Total Salary "+calculateSalary());
    }
}
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;
    PartTimeEmployee(int id,String name,double baseSalary,int hoursWorked,double hourlyRate) {
        super(id,name,baseSalary);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    public double calculateSalary() {
        return hoursWorked*hourlyRate;
    }
    public void assignDepartment(String dept) {
        department=dept;
    }
    public String getDepartmentDetails() {
        return department;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department "+department);
        System.out.println("Hours Worked "+hoursWorked);
        System.out.println("Total Salary "+calculateSalary());
    }
}
public class EmployeMain {
    public static void main(String[] args) {
        Employee[] employees=new Employee[2];

        FullTimeEmployee emp1=new FullTimeEmployee(10,"Anshu",50000);
        emp1.assignDepartment("IT");

        PartTimeEmployee emp2=new PartTimeEmployee(102,"Shivam",0,80,500);
        emp2.assignDepartment("Support");

        employees[0]=emp1;
        employees[1]=emp2;
        for(Employee emp:employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}