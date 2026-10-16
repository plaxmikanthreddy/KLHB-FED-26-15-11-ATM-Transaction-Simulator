import java.util.Scanner;

public class Main {
    static void showMenu() {
        System.out.println("\n1. Balance  2. Deposit  3. Withdraw  4. Exit");
    }

    static double deposit(Scanner sc, double balance) {
        System.out.print("Deposit amount: Rs. ");
        double amount = sc.nextDouble();
        if (amount <= 0 || !Double.isFinite(amount)) {
            System.out.println("Invalid amount.");
            return balance;
        }
        return balance + amount;
    }

    static double withdraw(Scanner sc, double balance) {
        System.out.print("Withdrawal amount: Rs. ");
        double amount = sc.nextDouble();
        if (amount <= 0 || !Double.isFinite(amount)) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.00;
        int choice;
        do {
            showMenu();
            System.out.print("Choose: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.printf("Balance: Rs. %.2f%n", balance); break;
                case 2: balance = deposit(sc, balance); break;
                case 3: balance = withdraw(sc, balance); break;
                case 4: System.out.println("Goodbye."); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 4);
        sc.close();
    }
}
