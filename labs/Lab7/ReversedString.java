package Lab7;
import java.util.Scanner;
import static java.lang.Math.*;

public class ReversedString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string to be reversed: ");
        try {
            String a = input.nextLine();
            String reversed = "";
            for(int i = (a.length() - 1); i >= 0; i--) {
//                System.out.println(i);
                String letter = String.valueOf(a.charAt(i));
                reversed = reversed + letter;
            };

            System.out.println("Reversed: " + reversed);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
