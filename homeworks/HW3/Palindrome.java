import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String str = "";
        try {
            str = input.nextLine();
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
        System.out.println(isPalindrome(str));
        input.close();
    }
    public static String isPalindrome(String s) {
        String s1 = s.toLowerCase();
        String help = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                help = help + s1.charAt(i);
            } else continue;
        }
        String rev = "";
        for (int k = help.length() - 1; k >= 0; k--) {
            rev = rev + help.charAt(k);
        }
        if (help.equals(rev)) {
            return ("Input string " + s + " is a palindrome");
        } else return ("Input string " + s + " is NOT a palindrome");
    }
}
