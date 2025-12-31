package Lab15;

public class ValidFilePath {
    public static void main(String[] args){
        System.out.println(validURL("hi/usrbin\\python3"));
    }

    public static boolean validURL(String s){
        String newS = s.trim();
        String regex = "";
        int regexCount1 = 0;
        int regexCount2 = 0;
        for(int i = 0; i < newS.length(); i++){
            char currChar = newS.charAt(i);
            if (currChar == '\\'){
                regexCount1++;
            }
            if (currChar == '/'){
                regexCount2++;
            }
        }
        if(regexCount1 != 0 && regexCount2 != 0){
            return false;
        }
        else if (regexCount1 > regexCount2)
            regex = "\\\\";
        else if(regexCount2 > regexCount1)
            regex = "/";
        if (!regex.equals("/") && !regex.equals("\\\\")){
            return false;
        }
        String[] words = newS.split(regex);
        System.out.println(words.length);
        return (words.length - 1 == Math.max(regexCount1, regexCount2));
    }
}
