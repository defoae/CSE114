package Lab23;
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        System.out.println(sumDigits(input.nextLong()));
    }

    public static int sumDigits(long n){
        if(n >= 0 && n <= 9){
            return (int)n;
        }
        int lastDigit = (int)n % 10;
        int remaining = (int)n / 10;

        return lastDigit + sumDigits(remaining);

    }
}
