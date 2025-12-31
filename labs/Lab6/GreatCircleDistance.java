package Lab6;

import java.util.Scanner;
import static java.lang.Math.*;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 6371.01;
        double lat1, lon1, lat2, lon2;

        try {
            System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
            String point1 = input.nextLine();

            System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
            String point2 = input.nextLine();

            lat1 = Double.parseDouble(point1.substring(0, point1.indexOf(" ")));
            lon1 = Double.parseDouble(point1.substring(point1.indexOf(" ") + 1));

            lat2 = Double.parseDouble(point2.substring(0, point2.indexOf(" ")));
            lon2 = Double.parseDouble(point2.substring(point2.indexOf(" ") + 1));

            Double d = radius * (acos ( sin(toRadians(lat1)) * sin(toRadians(lat2)) + cos(toRadians(lat1)) * cos(toRadians(lat2)) * cos(toRadians(lon1 - lon2))));
            System.out.println("The distance between the two points is " + d + " km");

        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }

        input.close();
    }
}
