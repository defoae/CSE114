package Lab10;

public class BubbleSort {
    public static void main(String[] args) {
        for (double v : sortBubble(new double[]{6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5})) {
            System.out.printf("%.1f", v);
            System.out.printf(" ");
        }
    }

    public static double[] sortBubble(double[] arr) {
        boolean changed = false;
        do {
            changed = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    changed = true;
                }
            }
        } while (changed);
        return arr;
    }
}
