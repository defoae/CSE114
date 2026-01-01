package Lab24;

public class Pyramid {
    public static void main(String[] args){
        pyramid(3);
    }
    public static void pyramid(int size){
        pyramidHelper(size, 1);
    }
    public static void pyramidHelper(int size, int num){
        if(size >= num){
            printSpace(size - num);
            decrementRec(num);
            incrememntRec(2, num);
            System.out.println();
            pyramidHelper(size, num+1);
        }
    }

    public static void printSpace(int high){
        if(high > 0){
            System.out.print(" ");
            printSpace(high - 1);
        }
    }

    public static void decrementRec(int high){
        if(high > 0){
            System.out.print(high + " ");
            decrementRec(high - 1);
        }
    }

    public static void incrememntRec(int index, int high){
        if(index<= high){
            System.out.print(index + " ");
            incrememntRec(index  +1, high);
        }
    }
}
