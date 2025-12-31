package Lab7;
import java.lang.classfile.instruction.ExceptionCatch;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int i = 0;
        int neg = 0;
        int pos = 0;
        int num = 0;
        do {
            try {
                System.out.println("Your number: ");
                num = input.nextInt();
                total = total + num;
                i++;
                if (num < 0) neg++;
                else if (num > 0) pos++;
                else if (num == 0) break;
            } catch (Exception e) {
                System.out.println("Error: "+e.toString());
            }
        }while( num != 0);

            System.out.println("Total: " + total + "; Average: " + total/i + "; # of Numbers: " + i + "; # of Negatives: " + neg + "; # of Postives: " + pos);
    }
}
