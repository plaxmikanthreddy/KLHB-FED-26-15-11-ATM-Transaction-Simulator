import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        boolean authenticated = false;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();
            if (pin == CORRECT_PIN) {
                authenticated = true;
                break;
            }
            attempts++;
            System.out.println("Incorrect. Attempts remaining: " + (3 - attempts));
        }

        if (!authenticated) {
            System.out.println("Access denied.");
            sc.close();
            return;
        }

        double balance = 5000.00;
        int choice;
        do {
            System.out.println("\n1. Balance  2. Deposit  3. Withdraw  4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Balance: Rs. %.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Deposit: Rs. ");
                    double d = sc.nextDouble();
                    if (d > 0 && Double.isFinite(d)) balance += d;
                    else System.out.println("Invalid amount.");
                    break;
                case 3:
                    System.out.print("Withdraw: Rs. ");
                    double w = sc.nextDouble();
                    if (w <= 0 || !Double.isFinite(w)) System.out.println("Invalid amount.");
                    else if (w > balance) System.out.println("Insufficient balance.");
                    else balance -= w;
                    break;
                case 4:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);

        sc.close();
    }
}