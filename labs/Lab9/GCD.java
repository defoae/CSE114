package Lab9;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        try {
            System.out.println("Enter the first integer: ");
            num1 = input.nextInt();
            System.out.println("Enter the second integer: ");
            num2 = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
        System.out.println("The greatest common divisor is: "+gcd(num1, num2));
        input.close();
    }
    public static int gcd(int num1, int num2) {
        int div = 1;
        for (int i = 2; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i ==0) {
                div = i;
            } else continue;
        }
        return div;
    }
}
