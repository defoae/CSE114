package Lab9;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of base and height: ");
        double base = 0;
        double height = 0;

        try {
            String strInput = input.nextLine();
            base = Double.parseDouble(strInput.substring(0, strInput.indexOf(" ")));
            height = Double.parseDouble(strInput.substring(strInput.indexOf(" ")));
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Area of this triangle with base "+base+ " and height " + height + " is: " + areaOfTriangle(base, height));
        input.close();
    }

    public static double areaOfTriangle(double base, double height) {
        return (0.5 * base * height);
    }
}
