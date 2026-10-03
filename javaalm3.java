import java.util.Scanner;
public class javaalm3 {
    public static int calculateTotal(int morningUsage, int nightUsage) {
        return morningUsage + nightUsage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter morning water usage (in litres): ");
        int morningUsage = sc.nextInt();
        System.out.print("Enter night water usage (in litres): ");
        int nightUsage = sc.nextInt();
        int totalConsumption = calculateTotal(morningUsage, nightUsage);
        System.out.println("Total Water Consumption: " + totalConsumption + " litres");
        sc.close();
    }
}

