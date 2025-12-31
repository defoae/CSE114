package Lab7;

import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your option: ");
        try {
            String option = input.next().toUpperCase();

            switch (option) {
                case ("A"): {
                    System.out.println("Enter a quantity in pounds: ");
                    int pounds = input.nextInt();
                    System.out.println(pounds + " pounds is " + pounds / 2.2 + " kilos");
                    break;
                }
                case ("B"): {
                    System.out.println("Enter a quantity in kilos: ");
                    int kilos = input.nextInt();
                    System.out.println(kilos + " kilos is " + kilos * 2.2 + " pounds");
                    break;
                }
                case ("C"): {
                    System.out.println("Enter a quantity in kilometers: ");
                    int km = input.nextInt();
                    System.out.println(km + " kilometers is " + km  * 0.621371 + " miles");
                    break;
                }
                case ("D"): {
                    System.out.println("Enter a quantity in miles: ");
                    int miles = input.nextInt();
                    System.out.println(miles + " miles is " + miles / 0.621371 + " kilometers");
                    break;
                }
                case ("E"): {
                    System.out.println("Enter a quantity celsius: ");
                    int celsius = input.nextInt();
                    System.out.println(celsius + " Celsius is " + ((celsius * 1.8) + 32) + " Fahrenheit");
                    break;
                }
                case ("F"): {
                    System.out.println("Enter a quantity in fahrenheit: ");
                    int fahrenheit = input.nextInt();
                    System.out.println(fahrenheit + " Fahrenheit is " + ((fahrenheit - 32) * 5/9) + " Celsius");
                    break;
                }
                case ("G"): {
                    System.out.println("Good bye!");
                    break;
                }
                default: System.out.println("Such option is not found");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }
}
