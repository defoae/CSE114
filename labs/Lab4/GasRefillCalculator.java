package Lab4;
import java.util.Scanner;

public class GasRefillCalculator {
    public static void main(String[] arhs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        double distance = input.nextInt();

        System.out.println("Enter the mpg: ");
        double mpg = input.nextDouble();

        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        double tripCost = (distance / mpg) * price;

        System.out.println("Price of the trip: " + tripCost);
    }
}
