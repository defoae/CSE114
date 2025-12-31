import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = "";
        String s2 = "";
        try {
            System.out.println("Enter the first string: ");
            s1 = input.nextLine();
            System.out.println("Enter the second string: ");
            s2 = input.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println(anagram(s1, s2));
        input.close();
    }

    public static String anagram(String str1, String str2) {
        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();
        char[] chars1 = new char[str1.length()];
        char[] chars2 = new char[str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            if (str1Lower.charAt(i) <= 'z' && str1Lower.charAt(i) >= 'a') {
                chars1[i] = str1Lower.charAt(i);
            } else continue;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2Lower.charAt(i) <= 'z' && str2Lower.charAt(i) >= 'a') {
                chars2[i] = str2Lower.charAt(i);
            } else continue;
        }
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2)) {
            return (str1 + " and " + str2 + " are anagrams");
        } else return (str1 + " and " + str2 + " are NOT anagrams");
    }
}
