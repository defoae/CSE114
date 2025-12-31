package Lab6;

import java.util.Scanner;

import static java.lang.Math.*;

public class RegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sides;
        double length;

        try {
            System.out.println("Enter the number of sides: ");
            sides = input.nextInt();
            System.out.println("Enter the side length: ");
            length = input.nextDouble();

            if (length>0 && sides>0) {
                double area = ( sides *(pow(length,2)) / (4 * tan(Math.PI / sides )));
                System.out.println("The area of the polygon is "+ area);
            } else {
                System.out.println("Check your inputs");
            }
        } catch (Exception e) {
            System.out.println("Error: e");
        }
        input.close();
    }
}
