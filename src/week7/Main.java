import java.util.Scanner;

class Account {
    private double balance;

    Account(double openingBalance) {
        balance = openingBalance;
    }

    double getBalance() {
        return balance;
    }

    boolean deposit(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) return false;
        balance += amount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0 || !Double.isFinite(amount) || amount > balance) return false;
        balance -= amount;
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(5000.00);

        System.out.println("1. Balance  2. Deposit  3. Withdraw");
        System.out.print("Choose: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.printf("Balance: Rs. %.2f%n", account.getBalance());
        } else if (choice == 2 || choice == 3) {
            System.out.print("Amount: Rs. ");
            double amount = sc.nextDouble();
            boolean success = choice == 2
                    ? account.deposit(amount) : account.withdraw(amount);
            System.out.println(success ? "Transaction successful." : "Transaction rejected.");
            System.out.printf("Balance: Rs. %.2f%n", account.getBalance());
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
