import java.util.*;

class Account {
    private final String accountId;
    private double balance;

    Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    String getAccountId() { return accountId; }
    double getBalance() { return balance; }

    boolean deposit(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) return false;
        balance += amount;
        return true;
    }
}

class TransactionRecord {
    final String id;
    final String type;
    final double amount;

    TransactionRecord(String id, String type, double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return id + " | " + type + " | Rs. " + String.format("%.2f", amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Map<String, Account> accounts = new HashMap<>();
        accounts.put("A100", new Account("A100", 5000.00));

        List<TransactionRecord> history = new ArrayList<>();
        Set<String> transactionIds = new HashSet<>();

        Account account = accounts.get("A100");
        String id = UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        if (transactionIds.add(id) && account.deposit(250.00)) {
            history.add(new TransactionRecord(id, "Deposit", 250.00));
        }

        System.out.println("Account: " + account.getAccountId());
        System.out.printf("Balance: Rs. %.2f%n", account.getBalance());
        System.out.println("History:");
        for (TransactionRecord record : history) {
            System.out.println(record);
        }
    }
}
