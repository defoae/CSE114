package Lab8;

public class ApproximatePI {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {

            double value = 0;

            for (int k = 1; k < i; k++) {
                value += (Math.pow(-1, k + 1)) / ((2 * k - 1));
            }

            System.out.println("i=" + i + " Pi approximate: " + (4 * value));
        }
    }
}
