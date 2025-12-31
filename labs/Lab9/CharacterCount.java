package Lab9;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String strInput = "";
        Character strChar = null;

        try {
            strInput = input.nextLine();
            System.out.println("Enter the character: ");
            strChar = input.next().charAt(0);

        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }

        System.out.println("Number of character occurrences in a string: "+ count(strInput, strChar));
        input.close();
    }

    public static int count(String str, char a) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == a) {
                counter++;
            }
        }
        return counter;
    }
}
