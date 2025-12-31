package Lab15;

import javax.swing.*;

public class ValidDate {
    public static void main(String[] args){
        System.out.println(validDate("2025-10-23"));
        System.out.println(validDate("10/23/2025"));
        System.out.println(validDate("23 Oct 2025"));
        System.out.println(validDate("64 Oct 2025"));
        System.out.println(validDate("10\\23\\2025"));
    }

    public static boolean validDate(String s){
        String trimmedS = s.trim();
        String regex = "";
        for (int i = 0; i < trimmedS.length(); i++) {
            char currChar = trimmedS.charAt(i);
            if (currChar == ' ' || currChar == '/' || currChar == '-'){
                regex = String.valueOf(currChar);
                break;
            }
        }
        String[] elements = trimmedS.split(regex);
        if (elements.length != 3)
            return false;
        switch (regex) {
            case " ": {
                int check = 0;
                if (Integer.parseInt(elements[0]) <= 31 && Integer.parseInt(elements[0]) >= 1)
                    check++;
                if(elements[1].length() == 3)
                    check++;
                if (elements[2].length() == 4 && Integer.parseInt(elements[2]) <= 2025)
                    check++;
                if (check == 3){
                    return true;
                }
                break;
            }
            case "/": {
                int check = 0;
                if (Integer.parseInt(elements[0]) >= 1 && Integer.parseInt(elements[0]) <= 12)
                    check++;
                if(Integer.parseInt(elements[0]) >= 1 && Integer.parseInt(elements[0]) <= 31)
                    check++;
                if (elements[2].length() == 4 && Integer.parseInt(elements[2]) <= 2025)
                    check++;
                if(check == 3)
                    return true;
                break;
            }
            case "-": {
                int check = 0;
                if (elements[0].length() == 4 && Integer.parseInt(elements[0]) <= 2025)
                    check++;
                if (Integer.parseInt(elements[1]) >= 1 && Integer.parseInt(elements[1]) <= 12)
                    check++;
                if (Integer.parseInt(elements[2]) >= 1 && Integer.parseInt(elements[2]) <= 31)
                    check++;
                if (check == 3){
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
