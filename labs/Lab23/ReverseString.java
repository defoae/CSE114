package Lab23;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s = input.nextLine();
            reverseDisplay(s);
    }

    // helper method we can use to avoid creating substrings
    public static void reverseDisplay(String str) {
        // starts from the last char
        reverseDisplay(str, str.length() - 1);
    }

    // recursive method
    public static void reverseDisplay(String str, int index) {
        // base case
        if (index < 0){
            return;
        }
        // recursive case
        // print the last char
        System.out.print(str.charAt(index));
        // call the method on the char before the last one
        reverseDisplay(str, index - 1);
    }
}
