package Lab11;

import java.util.Scanner;
public class BusinessStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        String numList = input.nextLine();
        input.close();
        String[] numArrStr = numList.split(" ");
        double[] numArrDb = new double[numArrStr.length];
        for (int i = 0; i < numArrDb.length; i++){
            numArrDb[i] = Double.parseDouble(numArrStr[i]);
        }
        System.out.print("The mean is ");
        System.out.printf("%.2f", mean(numArrDb));
        System.out.println();
        System.out.print("The standard deviation is ");
        System.out.printf("%.5f", deviation(numArrDb));
        System.out.println();
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (double val : x) {
            sum += val;
        }
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double seriesSum = 0;
        for (int i = 0; i < x.length; i++) {
            double helper = Math.pow((x[i] - mean(x)), 2);
            seriesSum += helper;
        }
        return Math.sqrt(seriesSum / (x.length - 1));
    }

}
