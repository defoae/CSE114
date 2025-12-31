import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = 0;
        try {
            System.out.println("Enter the number of lines: ");
            lines = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        for (int i = 0; i < lines; i++) {
            int middleNum = (int) Math.pow(2, i);
            int[] before;
            int[] after;
            before = new int[i];
            after = new int[i];
            String spaces = "";
            for (int k = 0; k < lines - i; k++) {
                System.out.printf("%6s", "");
            }
            for (int m = 0; m < i; m++) {
                before[m] = (int) Math.pow(2, m);
            }

            after = reverse(copy(before));

            for (int p : before) {
                System.out.printf("%6d", p);
            }

            System.out.printf("%6d", middleNum);

            for (int l : after) {
                System.out.printf("%6d", l);
            }

            System.out.println();
        }

        input.close();
    }

    public static int[] reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    public static int[] copy(int[] arr) {
        int[] myArr;
        myArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            myArr[i] = arr[i];
        }
        return myArr;
    }
}
