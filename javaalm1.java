import java.util.Scanner;

public class javaalm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();
        System.out.print("Enter number of family members: ");
        int familyMembers = sc.nextInt();
            System.out.print("Enter water consumed in litres: ");
        double waterConsumedLitres = sc.nextDouble();
             System.out.print("Enter water usage status (single character): ");
        char usageStatus = sc.next().charAt(0);
            System.out.println("\n--- Household Water Usage Details ---");
            System.out.println("House Number: " + houseNumber);
             System.out.println("Number of Family Members: " + familyMembers);
             System.out.println("Water Consumed: " + waterConsumedLitres + " litres");
            System.out.println("Water Usage Status: " + usageStatus);

        sc.close();
    }
}