package Lab13;

import java.util.Scanner;

public class RandomMatrix {
    public static void main(String[] args){
        int[][] matrix = new int[8][8];

        for(int i = 0; i < 8; i++){
            for(int k = 0; k < 8; k++){
                matrix[i][k] = (int) (Math.random()*2);
            }
        }

        for(int[] row : matrix){
            for(int val : row){
                System.out.printf("%1d ",val);
            }
            System.out.println();
        }
        System.out.println();
        find(matrix);
    }

    public static void find(int[][] m){
        boolean found = false;
        for(int i=0; i<8; i++){
            int temp = m[i][0];
            boolean isSame = true;
            for (int j=1; j<8; j++){
                if (m[i][j] != temp){
                    isSame = false;
                    break;
                }
            }
            if (isSame){
                System.out.println("All " + temp + "s at row #" + (i+1)+".");
                found = true;
            }
        }

        for(int i=0; i<8; i++){
            int temp = m[0][i];
            boolean isSame = true;
            for (int k = 1; k < 8; k++){
                if (m[k][i] != temp){
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                System.out.println("All " + temp + "s at column #" + (i+1) +".");
                found = true;
            }
        }

        int temp = m[0][0];
        boolean isSame = true;
        for(int h = 1; h<8; h++){
            if(m[h][h] != temp){
                isSame = false;
                break;
            }
        }
        if (isSame) {
            System.out.println("All " + temp + "s on major diagonal.");
            found = true;
        }

        temp = m[0][7];
        isSame = true;
        for(int i = 1; i < 8; i++) {
            if (m[i][7 - i] != temp){
                isSame = false;
                break;
            }
        }
        if (isSame) {
            System.out.println("All " + temp + "s on minor diagonal.");
            found = true;
        }

        if (!found) {
            System.out.println("No matches found.");
        }
    }
}
