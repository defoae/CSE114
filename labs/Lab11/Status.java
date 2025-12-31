package Lab11;

import java.util.Scanner;
public class Status {
    public static void main(String[] arhs) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter an integer: 1, 2, 3, or 4: ");
        int x = stdin.nextInt();
        stdin.close();

        switch(x){
            case 1: {System.out.println("Freshman");
                    break;
            }
            case 2: {System.out.println("Sophomore");
                    break;
            }
            case 3: {System.out.println("Junior");
                break;
            }
            case 4: {System.out.println("Senior");
                break;
            }
            default: System.out.println("Improper input");
        }
    }
}
