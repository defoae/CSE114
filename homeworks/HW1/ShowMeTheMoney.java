// Dinmukhamed Madiyar #117506411

import java.util.Scanner;

public class ShowMeTheMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in the number of farthings: ");
        int farthings;
        try {
            farthings = input.nextInt();
            if (farthings>=0) {
                int sterling, shilling, penny;

                sterling = farthings / 960;
                int rem = farthings % 960;

                shilling = rem / 48;
                rem = rem % 48;

                penny = rem / 4;
                rem = rem % 4;

                farthings = rem;

                System.out.println("Pound sterling: "+sterling);
                System.out.println("Shilling: "+shilling);
                System.out.println("Penny: "+penny);
                System.out.println("Farthings: "+farthings);
            } else {
                System.out.println("Enter the valid number of farthings");
                return;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Check the type of input");
        }
        input.close();
    }
}
