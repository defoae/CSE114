package Lab10;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        String numList = "";

        try {
            numList = input.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        input.close();

        int spaces = 0;

        for (int i = 0; i < numList.length(); i++) {
            if ((String.valueOf(numList.charAt(i)).equals(" "))) spaces++;
        }

        String[] myArr = numList.split(" ");

        String[] helper = new String[myArr.length];
        helper[0] = myArr[0];
        int distCount = 1;

        for (int i = 1; i < myArr.length; i++) {
                if (!isPresent(helper, myArr[i], distCount)) {
                    helper[distCount] = myArr[i];
                    distCount++;
                }
        }

        System.out.print("Unique numbers: ");

        for (int i = 0; i < distCount; i++) {
            System.out.printf("%s", helper[i]);
            System.out.printf("%s", " ");
        }
        System.out.println();
        System.out.println("Number of distinct numbers: "+distCount);
    }

    public static Boolean isPresent(String[] arr, String val, int size) {
        for (int u = 0; u < size; u++) {
            if (arr[u].equals(val)) {
                return true;
            }
        }
        return false;
    }
}
