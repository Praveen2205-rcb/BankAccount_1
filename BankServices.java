public class BankServices {

    static class BankAccount {
        private double balance;

        public BankAccount() {
            this.balance = 0;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Deposit must be positive. Transaction ignored.");
                return;
            }
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal must be positive. Transaction ignored.");
                return;
            }
            if (amount > balance) {
                System.out.println("Insufficient balance. Transaction ignored.");
                return;
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        // Create account with default balance = 0
        BankAccount acc = new BankAccount();

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(800);
        System.out.println("Balance after deposit of 700: " + acc.getBalance());

        acc.withdraw(100);
        System.out.println("Balance after withdrawal of 100: " + acc.getBalance());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
