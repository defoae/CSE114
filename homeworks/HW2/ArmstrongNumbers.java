import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numList = "";

        System.out.println("Enter the lower limit: ");
        int lowerLimit = input.nextInt();
        System.out.println("Enter the upper limit: ");
        int upperLimit = input.nextInt();

        for (int i = lowerLimit; i < upperLimit; i++) {
            int sum = 0;
            String intString = String.valueOf(i);
            double Digits = intString.length();

            for (int k = 0; k < Digits; k++) {
                double helper = Character.getNumericValue(intString.charAt(k));
                sum = sum + (int)(Math.pow(helper, Digits));

            }
            if (sum == i) {
                if (numList.isEmpty()) {
                    numList += i;
                } else numList += " " + i;
            }
        }
        System.out.println("The Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are: "+numList);
        input.close();
    }
}
