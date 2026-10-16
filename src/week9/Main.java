import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account holder name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            sc.close();
            return;
        }

        System.out.print("Transaction type (Deposit/Withdrawal): ");
        String type = sc.nextLine().trim();
        if (!type.equalsIgnoreCase("Deposit") && !type.equalsIgnoreCase("Withdrawal")) {
            System.out.println("Unsupported transaction type.");
            sc.close();
            return;
        }

        System.out.print("Amount: Rs. ");
        String rawAmount = sc.nextLine().trim();
        try {
            double amount = Double.parseDouble(rawAmount);
            if (amount <= 0 || !Double.isFinite(amount)) {
                System.out.println("Amount must be positive.");
                return;
            }

            String id = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            StringBuilder receipt = new StringBuilder();
            receipt.append("\n===== ATM RECEIPT =====\n")
                   .append("Customer: ").append(name).append('\n')
                   .append("Transaction ID: ").append(id).append('\n')
                   .append("Type: ").append(type).append('\n')
                   .append(String.format("Amount: Rs. %.2f%n", amount))
                   .append("Time: ").append(time).append('\n')
                   .append("=======================\n");
            System.out.println(receipt);
        } catch (NumberFormatException ex) {
            System.out.println("Enter a valid amount, such as 250.00.");
        } finally {
            sc.close();
        }
    }
}
