package Lab3;

import java.util.Scanner;

public class ChangeMaker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type the amount of money: ");
        double money = input.nextDouble();
        int remainderCoins = getCents(money);

        int hundredBills = (int) money / 100;
        double remainder = money % 100;

        int fiftyBills = (int) remainder / 50;
        remainder = remainder % 50;

        int twentyBills = (int) remainder / 20;
        remainder = remainder % 20;

        int tenBills = (int) remainder / 10;
        remainder = remainder % 10;

        int fiveBills = (int) remainder / 5;
        remainder = remainder % 5;

        int oneBills = (int) remainder;

        int quarters = (int) remainderCoins / 25;
        remainderCoins = remainderCoins % 25;

        int dimes = (int) remainderCoins / 10;
        remainderCoins = remainderCoins % 10;

        int nickels = (int) remainderCoins;

        String output = (money + "$ Change is: " + isThereAny(hundredBills, 100, true) +
                isThereAny(fiftyBills, 50, true) + isThereAny(twentyBills, 20, true) +
                isThereAny(tenBills, 10, true) + isThereAny(fiveBills, 5, true) +
                isThereAny(oneBills, 1, true) + isThereAny(quarters, 25, false) +
                isThereAny(dimes, 10, false) + isThereAny(nickels, 1, false));

        System.out.println (output.substring(0, output.length() - 2));

        input.close();
    }

    public static String isThereAny(int val, int numericVal, boolean isPaper) {
        String word;
        String symbol;
        String message;

        if (isPaper) {
            word = "bills";
            symbol = "$";
        } else {
            word = "coins";
            symbol = "c";
        }

        if (val > 0) {
            message = (val + " x " + numericVal + symbol + " " + word + ", ");
        } else {
            message = "";
        }

        return message;
    }

    public static int getCents(double fullChange) {
        int cents;
        cents = Integer.valueOf(Double.toString(fullChange).substring((Double.toString(fullChange)).length() - 2));
        return cents;
    }
}
