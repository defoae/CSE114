package Lab20;

import java.util.ArrayList;

public class HexToDecimal {
    public static void main(String[] args) {
        try {
            System.out.println(parseHex("11A"));
        } catch (HexFormatException e) {
            System.out.println(e.toString());
        }
    }

    public static String parseHex(String hexString) throws HexFormatException{
        ArrayList<String> characters = new ArrayList<String>();
        String result = "";
        for (int i = 0; i< hexString.length(); i++){
            if(Character.isDigit(hexString.charAt(i)) || (hexString.charAt(i) <= 'F' && hexString.charAt(i) >= 'A')){
                characters.add(String.valueOf(hexString.charAt(i)));
            } else
                throw new HexFormatException("Invalid input for hex");
        }
        int index = hexString.length() - 1;
        int sum = 0;
        for (String ch : characters){
            if (Character.isDigit(ch.charAt(0))){
                sum+= (Integer.parseInt(ch) * (int)Math.pow(16, index--));
            }
            else {
                switch (ch){
                    case "A": {
                        sum+= 10 * (int)Math.pow(16, index--);
                        break;
                    }
                    case "B": {
                        sum+= 11 * (int)Math.pow(16, index--);
                        break;
                    }
                    case "C": {
                        sum+= 12 * (int)Math.pow(16, index--);
                        break;
                    }
                    case "D": {
                        sum+= 13 * (int)Math.pow(16, index--);
                        break;
                    }
                    case "E": {
                        sum+= 14 * (int)Math.pow(16, index--);
                        break;
                    }
                    case "F": {
                        sum+= 15 * (int)Math.pow(16, index--);
                        break;
                    }
                }
            }
        }
        return String.valueOf(sum);
    }
}
