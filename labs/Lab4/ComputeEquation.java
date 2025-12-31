package Lab4;
import java.util.Scanner;

public class ComputeEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        double x = input.nextInt();

        System.out.println("Enter the second value: ");
        double y = input.nextInt();

        System.out.println("Equation value: " + (x/(y - (3 * x)) + (x - 1) / (y / ( x+1 ) ) ) );

    }
}
