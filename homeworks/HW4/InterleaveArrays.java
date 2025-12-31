import java.util.Arrays;

public class InterleaveArrays {
    public static void main(String[] args) {
        ArrayUtils.print(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}));
        ArrayUtils.print(interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}));
        ArrayUtils.print(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10}));
        ArrayUtils.print(interleaveArrays(new int[]{9, 5, 8, 125, 29}, new int[]{1, 1, 5, 8, 45, 19}));
        ArrayUtils.print(interleaveArrays(new int[]{6, 19}, new int[]{7, 24, 54, 7, 5, 12}));
    }

    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int[] newArr = new int[array1.length + array2.length];
        for (int i = 0; i < (2 * Math.min(array1.length, array2.length)); i++) {
                if (i % 2 == 0) {
                    newArr[i] = array1[i / 2];
                } else newArr[i] = array2[i / 2];
        }

        int difference = Math.max(array1.length, array2.length) - Math.min(array1.length, array2.length);

        if (difference != 0) {
            for (int k = Math.min(array1.length, array2.length) * 2, i = Math.min(array1.length, array2.length); k < newArr.length && i < Math.max(array1.length, array2.length); k++, i++) {
                newArr[k] = array1.length > array2.length ? array1[i] : array2[i];
            }
        }
        return newArr;
    }
}
