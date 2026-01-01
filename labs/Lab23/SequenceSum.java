package Lab23;

public class SequenceSum {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            System.out.println(sequenceSum(i));
        }
    }

    public static double sequenceSum(int n){
        if(n == 1){
            return 1;
        }
        return 1.0/n + sequenceSum(n-1);
    }
}
