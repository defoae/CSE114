// Dinmukhamed Madiyar #117506411

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double side1, side2, side3;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Side 1: ");
            side1 = input.nextDouble();
            System.out.println("Side 2: ");
            side2 = input.nextDouble();
            System.out.println("Side 3: ");
            side3 = input.nextDouble();

            if (side1 > 0 && side2 > 0 && side3 > 0) {
                String type;
                type = ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2) ?
                        ((side1 == side2) && (side1 == side3)) ? "Equilateral" :
                                ((side1 == side2 ^ side2 == side3 ^ side3 == side1) ) ? "Isosceles" : "Scalene" : "Invalid Input!");
                System.out.println("Output: "+type);
            } else {
                System.out.println("Enter the valid lengths of sides");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
            System.out.println("Check the type of input");
        }
        input.close();
    }
}
