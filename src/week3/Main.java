import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.00;

        System.out.println("=== ATM SIMULATOR ===");
        System.out.printf("Opening balance: Rs. %.2f%n", balance);
        System.out.print("Enter deposit amount: Rs. ");
        double deposit = sc.nextDouble();

        if (deposit > 0 && Double.isFinite(deposit)) {
            balance += deposit;
            System.out.printf("Updated balance: Rs. %.2f%n", balance);
        } else {
            System.out.println("Deposit must be a positive finite amount.");
        }
        sc.close();
    }
}