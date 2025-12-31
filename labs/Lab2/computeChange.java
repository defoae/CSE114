package Lab2;

import java.util.Scanner;
public class computeChange {
    public static void main(String[] args) {
        int change, quarters, dimes, nickels, rem;

        System.out.println("Input the change amount 1-99: ");
        Scanner input = new Scanner(System.in);
        change = input.nextInt();

        quarters = change / 25;
        rem = change % 25;

        dimes = rem / 10;
        rem = rem % 10;

        nickels = rem;

        System.out.println(quarters + " Quarters," + dimes + " Dimes," + nickels + " Nickels");

        // Closing scanner to prevent memory leaks
        input.close();
    }
}
