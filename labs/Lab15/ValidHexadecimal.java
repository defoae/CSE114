package Lab15;

public class ValidHexadecimal {
    public static void main(String[] args){
        System.out.println(validHexadecimal("CD"));
    }

    public static boolean validHexadecimal(String s){
        String clearedUp = s.trim();
        for(int i = 0; i < clearedUp.length(); i++){
            char currChar = clearedUp.charAt(i);
            if (!(currChar <= '9' && currChar >= '0') && !(currChar >= 'A' && currChar <= 'F')){
                return false;
            }
        }
        for (int i = 0; i < clearedUp.length() - 1; i++){
            char currChar = clearedUp.charAt(i);
            char nextChar = clearedUp.charAt(i + 1);
            if ((Character.isDigit(currChar)) && (nextChar <='9' && nextChar >= '0')){
                return false;
            }
        }
        return true;
    }
}
