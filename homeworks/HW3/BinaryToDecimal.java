import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strBinary = "";
        System.out.println("Enter binary: ");
        try{
            strBinary = input.next();
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());

        }
        System.out.println("Decimal: " + bin2Dec(strBinary));
        input.close();
    }

    public static int bin2Dec(String binaryString) {
        String strDecimal = "";
        int power = binaryString.length() - 1;
        int intDecimal = 0;
        for (int i = 0; i < binaryString.length() ; i++) {
            double digit = Double.valueOf(String.valueOf(binaryString.charAt(i)));
            double val = digit * Math.pow(2, power);
            intDecimal = intDecimal + (int) val;
            power--;
        }
        return intDecimal;
    }
}
