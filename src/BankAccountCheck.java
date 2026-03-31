


class BankAccount {
    String accountHolder;
    String accountType;

    BankAccount(String name, String type) {
        this.accountHolder = name;
        this.accountType = type;
    }
}

class BalanceChecker implements Runnable {
    BankAccount account;

    BalanceChecker(BankAccount acc) {
        this.account = acc;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(
                    Thread.currentThread().getName() +
                            " [" + account.accountType + " Account] is checking balance | Priority " +
                            Thread.currentThread().getPriority()
            );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public  class BankAccountCheck {
    public static void main(String[] args) {

        BankAccount premiumAccount = new BankAccount("Anurag ", "Premium");
        BankAccount regularAccount = new BankAccount("Shivam", "Regular");
        BankAccount basicAccount = new BankAccount("Anshu ", "Basic");

        Thread premiumUser = new Thread(new BalanceChecker(premiumAccount), "Premium User");
        Thread regularUser = new Thread(new BalanceChecker(regularAccount), "Regular User");
        Thread basicUser = new Thread(new BalanceChecker(basicAccount), "Basic User");

        premiumUser.setPriority(Thread.MAX_PRIORITY);
        regularUser.setPriority(Thread.NORM_PRIORITY);
        basicUser.setPriority(Thread.MIN_PRIORITY);

        premiumUser.start();
        regularUser.start();
        basicUser.start();
    }
}
