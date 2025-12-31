package Lab9;

import java.util.Scanner;

public class ComputeSummation {
    public static void main(String[] args) {
        System.out.println("i\t\t\tm(i)");
        for (int i = 1; i<= 20; i++) {
            System.out.printf("%d\t\t\t%.4f", i, computeM(i));
            System.out.println();
        }
    }

    public static double computeM(double k) {
        double m = 0;
        for (double j = 1; j <= k; j++) {
            m = m + j / (j + 1);
        }
        return m;
    }
}