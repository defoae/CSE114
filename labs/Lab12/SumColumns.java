package Lab12;

import java.util.Scanner;

public class SumColumns {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimensions of an n x m matrix: ");
        int rows = 0;
        int elements = 0;
        try{
            rows = input.nextInt();
            elements = input.nextInt();
        } catch (Exception e){
            System.out.println("Error: "+e.toString());
        }

        double[][] myMartix = new double[rows][elements];
        System.out.println("Enter the matrix of "+ rows + " x " + elements + ": ");
        for(int j = 0; j < rows; j++){
            for(int p = 0; p < elements; p++) {
                myMartix[j][p] = input.nextDouble();
            }
        }
        input.close();
        for(double val : sumColumn(myMartix)){
            System.out.printf((int)val + " ");
        }
    }

    public static double[] sumColumn(double [][] m){
        double[] newArr = new double[m[0].length];

        for(int i = 0; i < m[0].length; i++){
            double sum = 0;
            for (int k = 0; k < m.length; k++) {
                sum += m[k][i];
            }
            newArr[i] = sum;
        }
        return newArr;
    }
}
