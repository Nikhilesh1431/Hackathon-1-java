import java.util.Scanner;
public class javaalm2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();
        int bill;
        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }
        System.out.println("Water Bill: Rs." + bill);

        scanner.close();
    }
}

