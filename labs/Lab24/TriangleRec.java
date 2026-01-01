package Lab24;

public class TriangleRec {
    public static void main(String[] args) {
        triangle(8);
        System.out.println();
        triangleRec(8);
    }

    public static void triangle(int maxStars) {
        for(int i=1; i<=maxStars; i++){
            for(int j=i; j>0; j--){;
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleRec(int maxStars) {
        triangleHelper(1, maxStars);
    }
    public static void triangleHelper(int rowNum, int maxStars) {
        if(rowNum <= maxStars) {
            drawRow(rowNum);
            triangleHelper(rowNum + 1, maxStars);
        }
    }
    public static void drawRow(int j) {
        if (j == 0)
            System.out.println();
        else {
            System.out.print("*");
            drawRow(j - 1);
        }
    }
    public static void drawSpaces(int j) {
        if (j > 0) {
            System.out.print(" ");
            drawSpaces(j - 1);
        }
    }
}
