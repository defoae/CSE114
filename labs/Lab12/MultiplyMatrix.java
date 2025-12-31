package Lab12;

import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.println("Enter 3x3 matrix1: ");

        try {
            for (int i = 0; i < 3; i++) {
                for (int k = 0; k < 3; k++) {
                    matrix1[i][k] = input.nextDouble();
                }
            }
            System.out.println("Enter 3x3 matrix2: ");
            for (int i = 0; i < 3; i++) {
                for (int k = 0; k < 3; k++) {
                    matrix2[i][k] = input.nextDouble();
                }
            }
        } catch (Exception e){
            System.out.println("Error: "+e.toString());
        }

        for(double[] row: multiplyMatrix(matrix1, matrix2)){
            for(double elem : row){
                System.out.printf("%.1f ", elem);
            }
            System.out.println();
        }
    }
    public static double[][] multiplyMatrix(double [][] a, double[][] b){
        double[][] newMatrix = new double[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                double val = 0;
                for(int k = 0; k < 3; k++){
                    val += a[i][k] * b[k][j];
                }
                newMatrix[i][j] = val;
            }
        }
        return newMatrix;
    }
}
