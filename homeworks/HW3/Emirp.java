public class Emirp {
    public static void main(String[] args) {
        int[] numList = new int[100];

        for (int i = 0, c = 0; c < 100; i++){
            if (non_palindrome(i) && prime(i)) {
                String numString = String.valueOf(i);
                String numRev = "";
                for (int n = numString.length() - 1; n >= 0; n--) {
                    numRev = numRev + numString.charAt(n);
                }
                if (prime(Integer.valueOf(numRev))) {
                    numList[c] = i;
                    c++;
                }
            }
        }
        for (int j : numList) {
            System.out.printf(j + " ");
        }
    }

    public static boolean non_palindrome(int n) {
        String nString = String.valueOf(n);
        String rev = "";
        for (int m = nString.length() - 1; m >= 0; m--) {
            rev = rev + nString.charAt(m);
        }
        if (rev.equals(nString)) {
            return false;
        } else return true;
    }

    public static boolean prime(int n) {
        int count = 0;
        for (int k = 1; k <= n; k++) {
            if ( n % k == 0) {
                count += 1;
            } else continue;
        }
        return (count == 2);
    }
}
