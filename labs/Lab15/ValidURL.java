package Lab15;

public class ValidURL {
    public static void main(String[] args){
        System.out.println(validURL("http://~cse114"));
    }

    public static boolean validURL(String s){
        String trimS = s.trim();
        String[] elems = trimS.split("/");
        return (elems.length == 4 && (elems[0].equals("http:") || elems[0].equals("https:")));
    }
}
