import java.util.Scanner;

public class Rational {
    private int numerator = 0;
    private int denominator = 1;

    public Rational(){

    }

    public Rational(int numerator, int denominator){
        int gcd = 1;
        for (int i = 2; i <= Math.min(numerator, denominator); i++){
            if (numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        this.numerator = numerator / gcd;
        if (denominator != 0){
            this.denominator = denominator / gcd;
        }
    }

    public static Rational add(Rational r1, Rational r2){
        int newDenominator = 1;
        while (!(newDenominator % r1.denominator == 0 && newDenominator % r2.denominator == 0)){
            newDenominator++;
        }
        int newR1Numerator = r1.numerator * (newDenominator / r1.denominator);
        int newR2Numerator = r2.numerator * (newDenominator / r2.denominator);
        int newNumerator = newR1Numerator + newR2Numerator;

        return new Rational(newNumerator, newDenominator);
    }

    public static Rational subtract(Rational r1, Rational r2){
        int newDenominator = 1;
        while (!(newDenominator % r1.denominator == 0 && newDenominator % r2.denominator == 0)){
            newDenominator++;
        }
        int newR1Numerator = r1.numerator * (newDenominator / r1.denominator);
        int newR2Numerator = r2.numerator * (newDenominator / r2.denominator);
        int newNumerator = newR1Numerator - newR2Numerator;

        return new Rational(newNumerator, newDenominator);
    }

    public static Rational multiply(Rational r1, Rational r2){
        int newNumerator = r1.numerator * r2.numerator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational divide(Rational r1, Rational r2){
        int newNumerator = r1.numerator * r2.denominator;
        int newDenominator = r1.denominator * r2.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public void print(){
        System.out.printf("%1d/%1d\n", this.numerator, this.denominator);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numerator1 = 0;
        int denominator1 = 0;
        int numerator2 = 0;
        int denominator2 = 0;
        try{
            System.out.println("Enter numerator for the first rational number: ");
            numerator1 = input.nextInt();
            System.out.println("Enter a non-zero denominator for the first rational number: ");
            denominator1 = input.nextInt();
            System.out.println("Enter numerator for the second rational number: ");
            numerator2 = input.nextInt();
            System.out.println("Enter a non-zero denominator for the second rational number: ");
            denominator2 = input.nextInt();
        } catch (Exception e){
            System.out.println("Error: "+e.toString());
        }

        Rational r1 = new Rational(numerator1, denominator1);
        Rational r2 = new Rational(numerator2, denominator2);

        System.out.printf("First rational number is: ");
        r1.print();
        System.out.printf("Second rational number is: ");
        r2.print();

        Rational additionResult = Rational.add(r1, r2);
        Rational substractionResult = Rational.subtract(r1, r2);
        Rational multiplicationResult = Rational.multiply(r1, r2);
        Rational divisionResult = Rational.divide(r1, r2);

        System.out.printf("Addition of the rational numbers is: ");
        additionResult.print();
        System.out.printf("Subtraction of the rational numbers is: ");
        substractionResult.print();
        System.out.printf("Multiplication of the rational numbers is: ");
        multiplicationResult.print();
        System.out.printf("Division of the rational numbers is: ");
        divisionResult.print();
    }
}
