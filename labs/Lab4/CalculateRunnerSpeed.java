package Lab4;
import java.util.Scanner;

public class CalculateRunnerSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the distance in miles: ");
        double distance = input.nextInt();

        System.out.println("Type the time in minutes: ");
        double minutes = input.nextInt();
        double hours = minutes / 60;

        double speed = distance / hours;

        System.out.println("Speed: "+speed);

        input.close();
    }
}
