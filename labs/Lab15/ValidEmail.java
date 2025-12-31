package Lab15;

public class ValidEmail {
    public static void main(String[] args){
        System.out.println(validEmail("dimash1215@@sbu.ru"));
    }

    public static boolean validEmail(String s){
        String trimS = s.trim();
        String[] elem = trimS.split("@");
        if(elem.length != 2){
            return false;
        }
        int periodCount = 0;
        for(int i = 0; i < elem[1].length(); i++){
            if(elem[1].charAt(i) == '.')
                periodCount++;
        }
        if(periodCount != 1)
            return false;
        else return true;
    }
}
