// Dinmukhamed Madiyar #117506411

import java.util.Scanner;

public class PentagonalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");

        try {
            int n = input.nextInt();
            int res = (((3 * n) - 1) / 2) * n;
            System.out.println("Pentagonal number: "+res);
        } catch (Exception e) {
            System.out.println("Error: "+ e.toString());
            System.out.println("Check the type of the the number you provide");
        }
        input.close();
    }
}
