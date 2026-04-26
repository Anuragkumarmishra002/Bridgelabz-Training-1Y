package com.gla.story_based;
class Account {
    String accountNumber;
    double balance;
    static String bankName = "Over Trust Bank";
    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double calculateInterest() {
        return 0; // Base method
    }

    void display() {
        System.out.println("Bank           = " + bankName);
        System.out.println("Account No.    = " + accountNumber);
        System.out.println("Balance        = ₹" + balance);
        System.out.println("Interest Earned = ₹" + calculateInterest());
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}

public class BankInterest {
    public static void main(String[] args) {
        // Polymorphism: parent reference calling child methods
        Account a1 = new SavingsAccount("SA-1001", 50000.0);
        Account a2 = new CurrentAccount("CA-2001", 100000.0);

        System.out.println("Savings Account (4% Interest) ");
        a1.display();

        System.out.println("\n Current Account (2% Interest) ");
        a2.display();
    }
}
