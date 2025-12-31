package Lab5;

import java.util.Scanner;

public class PremiumAirlines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price;
        int points;
        String membership;

        try {
            System.out.print("Please enter membership (Diamond/Platinum/Regular): ");
            membership = fixInput(input.nextLine());
            System.out.print("Please enter ticket price: ");
            price = input.nextInt();
            System.out.print("Please enter current points: ");
            points = input.nextInt();

            if ((membership.equals("diamond") || membership.equals("platinum") || membership.equals("regular") ) && price >= 0 && points >= 0) {
                int add = 0;
                if ( (price >= 5000) && ( membership.equals("diamond") || membership.equals("platinum") ) ) {
                    add = 35;
                } else if ( price >= 2000 && points > 300 && membership.equals("diamond")) {
                    add = 30;
                } else if ( membership.equals("platinum") && price >= 2000) {
                    add = 20;
                } else if (price >= 500 && membership.equals("diamond") && points >= 100) {
                    add = 10;
                } else if ( membership.equals("regular") && price >= 5000) {
                    add = 5;
                } else if ( membership.equals("diamond") && points>= 25) {
                    add = 2;
                }
                System.out.print("Points: "+(points + add));
            } else {
                System.out.print("Check your input types");
            }
        } catch (Exception e) {
            System.out.print("Error: "+e.toString());
        }
        input.close();
    }

    public static String fixInput(String input) {
        String trim = input.trim();
        String lower = trim.toLowerCase();
        String noSpaces = lower.replaceAll(" ", "");
        return noSpaces;
    }
}
