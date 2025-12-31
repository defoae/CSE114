package Lab6;

import java.util.Scanner;

public class Emergency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String call, name, event, where;
        try {
            System.out.println("It's 911, what's your emergency?: ");

           // call = input.nextLine();
            System.out.println(secondMethod("Hello, my name is John Smith. I need to report a fire. Please come to 100 Circle Road.")); // expecting "a fire at 100 Circle Road reported by John Smith"

            System.out.println(secondMethod("Hello, my name is Mary Smith. I need to report a car accident. Please come to 2635 Main Street.")); // expecting "a car accident at 2635 Main Street reported by Mary Smith"

            System.out.println(secondMethod("Hello, my name is Joe Bell. I need to report a robbery. Please come to 3595 Oakwood Avenue.")); // expecting "a robbery at 3595 Oakwood Avenue reported by Joe M Bell"
            //System.out.println(secondMethod(call));
        } catch (Exception e) {
            System.out.println("Error: "+ e.toString());
        }
        input.close();
    }

    public static String getName(String ourString) {
        return ourString.substring(18, ourString.indexOf("."));
    }

    public static String getEvent(String newString) {
        return newString.substring(18, newString.indexOf("."));
    }

    public static String getWhere(String newStuff) {
        return newStuff.substring(16, newStuff.indexOf("."));
    }

    public static String secondMethod(String input) {
        String name = getName(input);

        String newSubstring = input.substring(input.indexOf(".") + 1);
        String event = getEvent(newSubstring);

        String newNewString = newSubstring.substring(newSubstring.indexOf(".") + 1);

        String where = getWhere(newNewString);

        return (event + " at " + where + " reported by " + name+ "\"");
    }
}
