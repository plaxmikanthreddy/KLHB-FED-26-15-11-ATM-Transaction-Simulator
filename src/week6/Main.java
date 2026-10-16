import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] types = new String[5];
        double[] amounts = new double[5];
        int count = 0;
        double balance = 5000.00;

        while (count < 5) {
            System.out.println("\n1. Deposit  2. Withdraw  3. History  4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Amount: Rs. ");
                double amount = sc.nextDouble();
                if (amount <= 0 || !Double.isFinite(amount)) {
                    System.out.println("Invalid amount.");
                    continue;
                }
                if (choice == 2 && amount > balance) {
                    System.out.println("Insufficient balance.");
                    continue;
                }
                if (choice == 1) {
                    balance += amount;
                    types[count] = "Deposit";
                } else {
                    balance -= amount;
                    types[count] = "Withdrawal";
                }
                amounts[count] = amount;
                count++;
                System.out.println("Transaction recorded.");
            } else if (choice == 3) {
                for (int i = 0; i < count; i++) {
                    System.out.printf("%d. %s: Rs. %.2f%n", i + 1, types[i], amounts[i]);
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        System.out.printf("Final balance: Rs. %.2f%n", balance);
        sc.close();
    }
}
