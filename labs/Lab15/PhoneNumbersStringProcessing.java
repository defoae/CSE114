package Lab15;

import javax.swing.*;

public class PhoneNumbersStringProcessing {
    public static void main(String[] args){
        for (String val : validPhones("Prof. Fodor phones are: 631-632-9820, (111) 111 1111, 516 123 456, 123-456-78900, 1(800)-FLOWERS, 6--3--1--6--3--2--8--9--5--9")){
            System.out.printf(val + " ");
        }
    }

    public static String[] validPhones(String text){
        int cutPoint = 0;
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) <= '9' && text.charAt(i) >= '0'){
                cutPoint = i;
                break;
            }
        }
        String newString = text.substring(cutPoint);
        String[] numbers = newString.split(",");
        int arrLength = 0;
        for (String val : numbers){
            int count = 0;
            for (int j = 0; j < val.length(); j++){
                char currChar = val.charAt(j);
                if (currChar <= '9' && currChar >= '0'){
                    count++;
                }
            }
            if (count == 10){
                arrLength++;
            }
        }
        String[] res = new String[arrLength];
        int index = 0;
        for (String val : numbers){
            int count = 0;
            for (int j = 0; j < val.length(); j++){
                char currChar = val.charAt(j);
                if (currChar <= '9' && currChar >= '0'){
                    count++;
                }
            }
            if (count == 10){
                res[index++] = val;
            }
        }
        return res;
    }
}
