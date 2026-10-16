import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== ATM TRANSACTION SIMULATOR ===");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome, " + name + "!");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("This week focuses on understanding the ATM flow.");
        sc.close();
    }
}
