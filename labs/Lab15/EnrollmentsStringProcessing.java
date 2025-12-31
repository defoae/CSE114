package Lab15;

public class EnrollmentsStringProcessing {
    public static void main(String[] args){
        System.out.println(enrollments(new String[]{"CSE-114", "AMS_310", "PHY  132", "Writ 102", "CHNN 101", "frn1012", "C-S-E 114", "C.S..E215", "B,,,I.-O 255", "-ECO 102"}));
    }

    public static int enrollments(String[] ids){
        int count = 0;
        for(String val : ids){
            int numbers = 0;
            int letters = 0;
            for (int i = 0; i < val.length(); i++){
                char currChar = val.charAt(i);
                if(currChar <= 'z' && currChar >= 'a')
                    letters++;
                else if(currChar <= 'Z' && currChar >= 'A')
                    letters++;
                else if(currChar <= '9' && currChar >= '0')
                    numbers++;
            }
            if (numbers == 3 && letters == 3)
                count++;
        }
        return count;
    }
}
