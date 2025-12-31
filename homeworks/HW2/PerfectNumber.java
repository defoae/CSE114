import java.util.Scanner;
import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upperLimit = 0;
        String perfectNums = "";
        try {
            System.out.println("Enter the upper limit: ");
            upperLimit = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }

        for (int i = 1; i < upperLimit; i++) {
            int divisorsSum = 0;
            for (int k = 1; k < i; k++) {
                if (i % k == 0) {
                    divisorsSum = divisorsSum + k;
                }
            }
            if (divisorsSum == i) {
                if (perfectNums.isEmpty()) {
                    perfectNums += i;
                } else {
                    perfectNums += " " + i;
                }
            }
        }
        System.out.println("The perfect numbers below " + upperLimit +  " are: " + perfectNums +".");
        input.close();
    }
}
