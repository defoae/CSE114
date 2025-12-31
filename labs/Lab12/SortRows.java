package Lab12;

import java.util.Scanner;
public class SortRows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row: ");

        try{
            for (int i = 0; i < 3; i++) {
                for (int k = 0; k<3; k++) {
                    matrix[i][k] = input.nextDouble();
                }
            }
        } catch(Exception e) {
            System.out.println("Error: "+ e);
        }
        input.close();

        for (int l = 0; l < 3; l++){
            for(double val : sortRows(matrix)[l]){
                System.out.printf(val + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m){
        for (int j = 0; j < 3; j++){
            for (int s = 0; s < 2; s++){
                int minindex = s;
                for (int r = s + 1; r < 3; r++){
                    if (m[j][minindex] > m[j][r]){
                        minindex = r;
                    }
                }
                double helper = m[j][minindex];
                m[j][minindex] = m[j][s];
                m[j][s] = helper;
            }
        }
        return m;
    }
}
