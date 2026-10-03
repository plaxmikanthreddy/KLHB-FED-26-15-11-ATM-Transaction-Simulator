import java.util.Scanner;

public class WaterUsageDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int familyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (A/I): ");
        char usageStatus = sc.next().charAt(0);

        System.out.println("\nHousehold Details");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + usageStatus);

        sc.close();
    }
}
