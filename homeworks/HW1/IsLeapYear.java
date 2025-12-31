// Dinmukhamed Madiyar #117506411

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a year: ");
        int year;
        try {
            year = input.nextInt();
            if (year >= 0) {
                boolean leap = ((year % 100 != 0) && (year % 4 == 0)) || year % 400 == 0;
                if (leap) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println("Enter a valid number");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
            System.out.println("Check the type of input");
        }
        input.close();
    }
}
