package Lab23;

public class RemoveDuplicates {
    public static void main(String[] args) {
            String str = "aafadfdsafsdfsdfsdfasdfasdf";
            System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        // base case
        if (str.length() <= 1)
            return str;
        // recursive call
        return str.charAt(0) + removeDuplicates(
                remove(str.charAt(0), str.substring(1)));
    }

    // recursively remove a single character from a string
    public static String remove(char c, String str) {
        // base case
        if (str.length() == 0)
            return str;
        // recursive case
        else if (c == str.charAt(0))
            return remove(c, str.substring(1));
        else
            return str.charAt(0) + remove(c, str.substring(1)); // string gets smaller and smaller as we work with it
    }
}
