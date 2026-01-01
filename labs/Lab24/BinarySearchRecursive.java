package Lab24;

public class BinarySearchRecursive {
    public static void main(String[] args){
        System.out.println(binaryRec(new int[]{1, 3, 6, 9, 12}, 3));
    }

    public static int binaryRec(int[] a, int key){
        return binaryHelper(a, 0, a.length - 1, key);
    }

    public static int binaryHelper(int[] a, int low, int high, int key){
        if(low <= high){
            int mid = (high+low) / 2;
            if(a[mid] == key){
                return mid;
            }
            if(a[mid] > key)
                return binaryHelper(a, low, mid -1, key);
            if(a[mid] < key)
                return binaryHelper(a, mid + 1, high, key);

        }
        return -1;
    }
}
