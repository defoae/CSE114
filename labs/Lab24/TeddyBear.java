package Lab24;

public class TeddyBear {
    public static void main(String[] args){
        System.out.println(teddyBear(99, 91, 53, 4));
    }

    public static boolean teddyBear(int initial, int goal, int increment, int steps){
        // base cases
        if(initial == goal){
            return true;
        }
        if(steps == 0)
            return false;

        // recursive cases
        if(teddyBear(initial + increment, goal, increment, steps - 1)){
            return true;
        }
        if(initial % 2 == 0){
            if(teddyBear(initial / 2, goal, increment, steps - 1)){
                return true;
            };
        }
        return false;
    }
}
