package Lab8;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "";
        System.out.println("Your string: ");
        try {
            s = input.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            String vowels[] = {"a", "e", "o", "y", "i", "u"};
            String consonants[] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "z"};
            String letter = String.valueOf(s.charAt(i)).toLowerCase();
            for (String k : vowels) {
                if (k.equals(letter)) {
                    vowel++;
                }
            }
            for (String l : consonants) {
                if (l.equals(letter)) {
                    consonant++;
                }
            }
        }

        System.out.println("The number of vowels is "+vowel);
        System.out.println("The number of consonants is " + consonant);
    }
}
