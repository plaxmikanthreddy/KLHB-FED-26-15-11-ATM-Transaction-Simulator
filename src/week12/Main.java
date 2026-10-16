import java.util.*;
import java.util.stream.Collectors;

class TransactionRecord {
    private final String type;
    private final double amount;

    TransactionRecord(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    String getType() { return type; }
    double getAmount() { return amount; }

    public String toString() {
        return type + ": Rs. " + String.format("%.2f", amount);
    }
}

public class Main {
    public static void main(String[] args) {
        List<TransactionRecord> history = Arrays.asList(
                new TransactionRecord("Deposit", 1000.00),
                new TransactionRecord("Withdrawal", 250.00),
                new TransactionRecord("Deposit", 500.00),
                new TransactionRecord("Withdrawal", 100.00)
        );

        System.out.println("All transactions:");
        history.forEach(System.out::println);

        List<TransactionRecord> withdrawals = history.stream()
                .filter(t -> t.getType().equals("Withdrawal"))
                .sorted(Comparator.comparingDouble(TransactionRecord::getAmount))
                .collect(Collectors.toList());

        System.out.println("\nWithdrawals (smallest first):");
        withdrawals.forEach(System.out::println);

        double totalDeposits = history.stream()
                .filter(t -> t.getType().equals("Deposit"))
                .mapToDouble(TransactionRecord::getAmount)
                .sum();
        double totalWithdrawals = history.stream()
                .filter(t -> t.getType().equals("Withdrawal"))
                .mapToDouble(TransactionRecord::getAmount)
                .sum();

        System.out.printf("%nTotal deposits: Rs. %.2f%n", totalDeposits);
        System.out.printf("Total withdrawals: Rs. %.2f%n", totalWithdrawals);
        System.out.printf("Net movement: Rs. %.2f%n", totalDeposits - totalWithdrawals);
    }
}
