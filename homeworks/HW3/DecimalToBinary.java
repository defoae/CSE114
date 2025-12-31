import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal: ");
        int dec = 0;

        try {
            dec = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error: ");
        }
        System.out.println("Binary: " + dec2Bin(dec));
        input.close();
    }

    public static String dec2Bin(int value) {
        String initial = "";
        String reverse = "";
        for (int i = value; i > 0; i = i / 2) {
            initial = initial + String.valueOf(i % 2);
        }
        for (int k = initial.length() - 1; k >= 0; k--) {
            reverse = reverse + initial.charAt(k);
        }
        return ("(" +reverse+ ")_2");
    }
}
