package Lab23;
import java.util.Scanner;

public class ReverseDisplay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        reverseDisplay(input.nextInt());
    }

    public static void reverseDisplay (int value){
        // example 12
        // value % 10 gives last digit
        // value / 10 removes digit

        //base ase
        if(value <= 9 && value >= 0){
            System.out.print(value); // printing in the same line with other nums
            return;
        }
        // recursive case
        int lastDigit = value % 10;
        int remaining = value / 10;

        System.out.print(lastDigit); // printing numbers in one line
        reverseDisplay(remaining);
    }
}
