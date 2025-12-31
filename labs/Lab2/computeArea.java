package Lab2;

import java.util.Scanner;
public class computeArea {
    public static void main(String[] args) {

        System.out.println("What is the radius?: ");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();

        double area = ((radius * radius) * 3.141592);

        System.out.println("The area of the circle with the radius " +radius+ " is " +area);
    }
}
