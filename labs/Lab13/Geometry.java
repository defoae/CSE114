package Lab13;

import java.util.Scanner;

public class Geometry {
    public static void main (String[] args) {
        double[][] matrix = new double[3][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");

        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 2; i++) {
                matrix[k][i] = input.nextDouble();
            }
        }

        if (getTriangleArea(matrix) != 0) {
            System.out.printf("The area of the triangle is %.2f", getTriangleArea(matrix));
        } else System.out.println("The three points are on the same line.");
    }

    public static double getTriangleArea(double[][] points){
        double area;
        int counter = 0;
        for (int i = 0; i < 3; i++){
                if(points[i][0] == points[i][1]) {
                    counter++;
                }
        }
        if (counter == 3){
            return 0;
        }
        double side1 = Math.sqrt(Math.pow(points[0][0] - points[1][0], 2) + Math.pow(points[0][1]-points[1][1], 2));
        double side2 = Math.sqrt(Math.pow(points[1][0] - points[2][0], 2) + Math.pow(points[1][1]-points[2][1], 2));
        double side3 = Math.sqrt(Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1]-points[0][1], 2));
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
