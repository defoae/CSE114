package Lab3;
import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the # minutes: ");
        double minutes = input.nextDouble();

        System.out.println("Type the constant speed of car in mph: ");
        double speed = input.nextDouble();

        System.out.println("Type the fuel efficiency of car in mpg: ");
        double efficiency = input.nextDouble();

        double consumedGallons = ((minutes / 60) * speed ) / efficiency;

        System.out.println("Consumed gas for the period (in gallons): " + consumedGallons);
    }
}
