import java.util.Scanner;

public class Interests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int period = 0;
        double loan = 0;
        try{
            System.out.print("Enter the loan amount: ");
            loan = input.nextDouble();
            System.out.print("Enter the loan period (# of years): ");
            period = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
        System.out.println("Interest Rate\tMonthly Payment\t\tTotal Payment");
        for (double i = 5; i <= 8; i = i + 0.125) {
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loan * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), period * 12)));
            double totalPayment = monthlyPayment * period * 12;
            System.out.printf("%.3f%%\t\t\t%.2f\t\t\t\t%.2f\n", i, monthlyPayment, totalPayment);
        }

    }
}
