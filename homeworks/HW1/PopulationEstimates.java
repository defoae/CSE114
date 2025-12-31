// Dinmukhamed Madiyar #117506411

import java.util.Scanner;

public class PopulationEstimates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");

        try {
            int year = input.nextInt();
            if (year>2000) {
                int lastTwo = (year % 1000) % 100;
                int population = (lastTwo - 10) * 3 + 310;
                System.out.println("Population estimate (millions of people): "+population);
            } else {
                System.out.println("Year should be from 2000 onward");
            }
            } catch (Exception e) {
                System.out.println("Error: "+e.toString());
                System.out.println("Check the type of input");
            }
        input.close();
    }
}
