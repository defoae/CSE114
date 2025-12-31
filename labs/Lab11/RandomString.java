package Lab11;

import java.util.Scanner;

public class RandomString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = input.nextInt();

        System.out.println("Enter the case (u or l): ");
        String casing = input.next();

        input.close();

        System.out.println(randomString(len, casing));
    }

    public static String randomString(int len, String ulCase){
        String newString = "";
        for (int i = 0; i < len; i++){
            if (ulCase.equals("u")) {
                newString += (char)(Math.random() * (('Z' - 'A') + 1) + 'A');
            }
            if (ulCase.equals("l")) {
                newString += (char)(Math.random() * (('z' - 'a') + 1) + 'a');
            }
        }
        return newString;
    }
}
