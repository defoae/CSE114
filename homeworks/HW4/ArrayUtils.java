public class ArrayUtils {
    public static void main(String[] args) {
        int[] randomArr = randomArray(100, 21);
        print(randomArr);
        double average = arraySum(randomArr) / 100;
        System.out.println("The average of the array of 100 elements with a sum " + arraySum(randomArr) +  " is: " + average);
        System.out.println(contains(randomArr, 12));
        System.out.println(countMultiplesOf(randomArr, 7));
    }

    public static int[] randomArray(int size, int limit) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * limit);
        }

        return arr;
    }

    public static void print(int[] array) {
        for (int v : array) {
            System.out.printf("%d" + " ", v);
        }
        System.out.println();
    }

    public static double arraySum(int[] arr) {
        double sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return sum;
    }

    public static int contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int countMultiplesOf(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % key == 0) count++;
        }
        return count;
    }
}
