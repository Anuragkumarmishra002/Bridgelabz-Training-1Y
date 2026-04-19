package Level1;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" Insufficient balance, Current balance: ₹ " + balance);
        } else if (amount <= 0) {
            System.out.println(" Invalid withdrawal amount ");
        } else {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder = " + accountHolder);
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Current Balance = Rs " + balance);
    }
}

 class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rahul ", "SBI00456", 20000.00);

        System.out.println(" Account Details ");
        account.displayBalance();

        System.out.println("\nTransactions");
        account.deposit(5000);
        account.withdraw(8000);
        account.withdraw(25000);

        System.out.println("\n Updated Balance ");
        account.displayBalance();
    }
}