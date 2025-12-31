package Lab5;

import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double premium;
        int age;
        String gender;

        try {
            System.out.println("Please enter in the premium price of the auto insurance policy: ");
            premium = input.nextDouble();
            System.out.println("Please enter in the person's age: ");
            age = input.nextInt();
            System.out.println("Please enter in either Male or Female for gender: ");
            gender = fixInput(input.next());

            if ( (age >= 0) && ( (gender.equals("male")) || (gender.equals("female")) ) ) {
                double cost = 0.0;
                if ((age >= 18 && age < 21) && gender.equals("male")) {
                    cost = 1.0;
                } else if ((age >= 18 && age < 21) && gender.equals("female")) {
                    cost = 0.9;
                } else if (age>=21 && age<30) {
                    cost = 0.75;
                } else if ((age>=30 && age<60) && gender.equals("male")) {
                    cost = 0.6;
                } else if ((age>=30 && age<60) && gender.equals("female")) {
                    cost = 0.7;
                } else if(age>=60) {
                    cost = 1;
                }
                System.out.print("Premium: "+ (cost * premium));
            } else {
                System.out.println(-1);
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
