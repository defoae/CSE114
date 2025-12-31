import java.util.Scanner;

public class Complex {
    private double realPart = 0;
    private double imaginaryPart = 0;

    public Complex(){

    }

    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public static Complex add(Complex c1, Complex c2){
        double newRealPart = c1.realPart + c2.realPart;
        double newImaginaryPart = c1.imaginaryPart + c2.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    public static Complex subtract(Complex c1, Complex c2){
        double newRealPart = c2.realPart - c1.realPart;
        double newImaginaryPart = c2.imaginaryPart - c1.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    public void print(){
        System.out.printf("(%.1f, %.1f)", this.realPart, this.imaginaryPart);
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double realPart1 = 0;
        double realPart2 = 0;
        double imaginaryPart1 = 0;
        double imaginaryPart2 = 0;
        try{
            System.out.println("Enter real part of the first complex number: ");
            realPart1 = input.nextDouble();
            System.out.println("Enter imaginary part of the first complex number: ");
            imaginaryPart1 = input.nextDouble();
            System.out.println("Enter real part of the second complex number: ");
            realPart2 = input.nextDouble();
            System.out.println("Enter imaginary part of the second complex number: ");
            imaginaryPart2 = input.nextDouble();
        } catch (Exception e){
            System.out.println("Error: "+e.toString());
        }
        input.close();

        Complex c1 = new Complex(realPart1, imaginaryPart1);
        Complex c2 = new Complex(realPart2, imaginaryPart2);

        System.out.printf("First complex number is: ");
        c1.print();
        System.out.printf("Second complex number is: ");
        c2.print();
        Complex addResult = Complex.add(c1, c2);
        System.out.printf("Addition of the complex numbers is: (%.1f, %.1f)\n", addResult.realPart, addResult.imaginaryPart);
        Complex subtractResult = Complex.subtract(c2, c1);
        System.out.printf("Subtraction of the complex numbers is: (%.1f, %.1f)\n", subtractResult.realPart, subtractResult.imaginaryPart);
    }
}
