import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = "";
        String s2 = "";
        try{
            System.out.println("Enter the first string: ");
            s1 = input.nextLine();
            System.out.println("Enter the second string: ");
            s2 = input.nextLine();
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
        String common = "";
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                common = common + s1.charAt(i);
            } else {
                break;
            }
        }
        String message = !common.isEmpty() ? "The common prefix is " + common : s1 + " and "  +s2 + " have no common prefix";
        System.out.println(message);
        input.close();
    }
}
