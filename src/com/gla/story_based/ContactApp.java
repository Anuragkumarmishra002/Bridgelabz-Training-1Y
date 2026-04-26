package com.gla.story_based;
class Contact {
    String name;
    String phoneNumber;
    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    void display() {
        System.out.println("Name  = " + name);
        System.out.println("Phone = " + phoneNumber);
    }
}
class BusinessContact extends Contact {
    String companyName;
    BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }
    @Override
    void display() {
        // Display name in uppercase for business contacts
        System.out.printf("Name    =%s%n", name.toUpperCase());
        System.out.printf("Phone   = %s%n", phoneNumber);
        System.out.printf("Company = %s%n", companyName);
    }
}

public class ContactApp {
    public static void main(String[] args) {
        Contact c1 = new Contact("Shivam", "9876543210");
        BusinessContact bc1 = new BusinessContact("Anshu", "9123456780", "TechSoft Pvt Ltd");

        System.out.println("|| Personal Contact || ");
        c1.display();

        System.out.println("\n|| Business Contact ||");
        bc1.display();

        // Polymorphism
        System.out.println("\n|| Polymorphism Demo || ");
        Contact c2 = new BusinessContact(" Vishnu", "9988776655", "InfoSys Ltd");
        c2.display();
    }
}
