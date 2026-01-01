package Lab23;

public class AckermannFunction {
    public static void main(String[] args){
        System.out.println(ackermann(0, 1));
    }

    public static int ackermann(int m, int n){
        // base case: A(0, n) = n + 1 for all nonnegative integers n
        if(m == 0){
            return n;
        }

        //A(m, 0) = A(m − 1, 1) for all positive integers m

        if(n == 0){
            return ackermann(m - 1, 1);
        }

        //A(m, n) = A(m − 1, A(m, n − 1)) for all positive integers m and n

        else{
            int inner = ackermann(m, n - 1);
            return ackermann(m -1, inner);
        }
    }
}
