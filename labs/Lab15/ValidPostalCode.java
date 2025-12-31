package Lab15;

public class ValidPostalCode {
    public static void main(String[] args){
        System.out.println(validPostalCode("12345-6789"));
        System.out.println(validPostalCode("12345-67895"));
        System.out.println(validPostalCode("11794"));
        System.out.println(validPostalCode("117941232323"));
    }

    public static boolean validPostalCode(String s){
        if(s.trim().length() == 5 || s.trim().length() == 10) {
            if(s.trim().length() > 5) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.trim().charAt(i) == '-')
                        return true;
                }
            }
            else return true;
        }
        return false;
    }
}
