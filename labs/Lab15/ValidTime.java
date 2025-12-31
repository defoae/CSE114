package Lab15;

public class ValidTime {
    public static void main(String[] args){
        System.out.println(validTime("1:35 PM"));
        System.out.println(validTime("24:35"));
    }

    public static boolean validTime(String s){
        String trimS = s.trim();
        String regex = ":";
        for(int i = 0; i<trimS.length(); i++){
            char curr = trimS.charAt(i);
            if(curr == ' '){
                regex = " ";
                break;
            }
        }
        String[] elems = trimS.split(regex);
        if(elems.length != 2)
            return false;
        switch (regex){
            case ":": {
                int check = 0;
                if(Integer.parseInt(elems[0]) >= 0 && Integer.parseInt(elems[0]) < 24)
                    check++;
                if(Integer.parseInt(elems[1]) > 0 && Integer.parseInt(elems[1]) < 60)
                    check++;
                if(check == 2)
                    return true;
            }
            case " ": {
                int check = 0;
                String[] numsPart = elems[0].split(":");
                if(numsPart.length != 2)
                    return false;
                if(Integer.parseInt(numsPart[0]) >= 0 && Integer.parseInt(numsPart[0]) < 12)
                    check++;
                if(Integer.parseInt(numsPart[1]) > 0 && Integer.parseInt(numsPart[1]) < 60)
                    check++;
                if(elems[1].equalsIgnoreCase("AM") || elems[1].equalsIgnoreCase("PM"))
                    check++;
                if (check == 3)
                    return true;
            }
        }
        return false;
    }
}
