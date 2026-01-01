package Lab23;

public class Occurrences {
    public static void main(String[] args){
        char[] chars = {'a', 'a', 'b', 'c'};
        int occurences = count(chars, 'a');
        System.out.println(occurences);
    }

    public static int count(char[ ] chars, char ch){

        return count(chars, ch, 0);
    }

    // recursive helper method
    public static int count(char[ ] chars, char ch, int index){
        // base case: if index is the same as the length of the array;
        if(index == chars.length){
            return 0;
        }

        // recursive case
        int thisOne;
        if(chars[index] == ch){
            thisOne = 1;
        }
        else thisOne = 0;
        return thisOne + count(chars, ch, index + 1);
    }
}
