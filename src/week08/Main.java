import java.util.Scanner;

abstract class Transaction {
    protected final double amount;

    Transaction(double amount) {
        this.amount = amount;
    }

    abstract boolean apply(Account account);
    abstract String description();
}

class Account {
    private double balance;

    Account(double balance) { this.balance = balance; }
    double getBalance() { return balance; }

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

class DepositTransaction extends Transaction {
    DepositTransaction(double amount) { super(amount); }
    boolean apply(Account account) { return account.deposit(amount); }
    String description() { return "Deposit"; }
}

class WithdrawalTransaction extends Transaction {
    WithdrawalTransaction(double amount) { super(amount); }
    boolean apply(Account account) { return account.withdraw(amount); }
    String description() { return "Withdrawal"; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(5000.00);
        try {
            System.out.print("Enter amount: Rs. ");
            double amount = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Type (D=deposit, W=withdraw): ");
            String type = sc.nextLine().trim().toUpperCase();

            Transaction transaction;
            if (type.equals("D")) transaction = new DepositTransaction(amount);
            else if (type.equals("W")) transaction = new WithdrawalTransaction(amount);
            else {
                System.out.println("Unknown transaction type.");
                return;
            }

            if (transaction.apply(account)) {
                System.out.println(transaction.description() + " successful.");
            } else {
                System.out.println("Transaction rejected.");
            }
            System.out.printf("Balance: Rs. %.2f%n", account.getBalance());
        } catch (NumberFormatException ex) {
            System.out.println("Please enter a valid numeric amount.");
        } finally {
            sc.close();
        }
    }
}
