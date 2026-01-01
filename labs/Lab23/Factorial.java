package Lab23;

public class Factorial {
    public static void main(String[] args){
        for(int i = 1; i<= 10; i++){
            System.out.println(factorial(i));

        }
    }

    public static long factorial(int n){
        // 0! = 1 and 1! = 1
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // recursive case
        return n * factorial(n-1);
    }
}
