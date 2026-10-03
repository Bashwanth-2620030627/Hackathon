//2a

public class Water
{
public static void main(String[] args)
{
int family = 8;
double waterconsume = 500.0;
int houseno = 200;
char usage = 'Normal';

System.out.println("Household Details");
System.out.println("Number of family members:" +family);
System.out.println("Water consumed in litres:" +waterconsume);
System.out.println("House Number:" +houseno);
System.out.println("Water Usage Status:" +usage);

         }
}

//2b
import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();

        int billAmount;

        if (consumption <= 500) {
            billAmount = 100;
        } else {
            billAmount = 200;
        }

        System.out.println("Water Bill Amount: Rs. " + billAmount);

        scanner.close();
    }
}

//2c

import java.util.Scanner;

public class WaterUsageCalculator {

    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning water usage (litres): ");
        int morning = scanner.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int evening = scanner.nextInt();

        int total = calculateTotal(morning, evening);
        System.out.println("Total Water Consumption: " + total + " litres");

        scanner.close();
    }
}
