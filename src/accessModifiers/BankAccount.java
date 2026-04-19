package accessModifiers;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs " + amount + " = Balance  Rs " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance ");
        } else {
            balance -= amount;
            System.out.println("Withdrawn Rs " + amount + "  = Balance = Rs " + balance);
        }
    }

    public void displayBalance() {
        System.out.println("Account=  " + accountNumber + " = Holder " + accountHolder + " =  Balance  Rs." + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account " + accountNumber + "  Holder " + accountHolder);
        System.out.println("Balance Rs." + getBalance() + "  Interest " + interestRate + "%");
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SBI001234", "Rahul ", 15000.00);

        acc.displayBalance();
        acc.deposit(5000);
        acc.withdraw(3000);
        acc.withdraw(20000);

        SavingsAccount sav = new SavingsAccount("SBI005678", "Anshu", 50000.00, 4.5);
        sav.displayDetails();
    }
}