// Dinmukhamed Madiyar #117506411

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of eggs in the order: ");
        int eggs;
        try {
            eggs = input.nextInt();
            if (eggs>=0) {
                int dozen, loose;
                double dozenPrice, loosePrice, totalPrice;
                dozen = eggs / 12;
                loose = eggs % 12;

                dozenPrice = dozen * 3.25;
                loosePrice = loose * 0.45;
                totalPrice = dozenPrice + loosePrice;

                System.out.println("You ordered "+eggs+" egg(s).\nThat's "+dozen+" dozen " +
                        "("+dozen+" x 12 = "+ dozen*12+" egg(s)) at $3.25 per dozen " +
                        "(" + dozen + " x $3.25 = $"+dozenPrice + ")\nand " + loose +" egg(s) at 45 cents " +
                        "(" + loose +" x 45c = $" + loosePrice+")\nfor a total of $" + totalPrice +
                        " ($" + dozenPrice + " + $" + loosePrice + " = $" + totalPrice + ").");
            } else {
                System.out.println("Enter the valid number of eggs in order");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Check the type of input");}
    }
}
