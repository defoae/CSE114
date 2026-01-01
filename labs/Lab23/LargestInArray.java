package Lab23;

public class LargestInArray {
    public static void main(String[] args){
        int[] list = {10, 20, 30, 70, 40};
        System.out.println(findLargest(list));
    }

    public static int max(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }

    public static int findLargest(int[] list){
        return findLargest(list, 0);
    }

    // recursive method
    public static int findLargest (int [ ] list, int currentIndex){
        if(currentIndex == list.length - 1){
            return list[currentIndex];
        }
        return max(list[currentIndex], findLargest(list, currentIndex + 1));
    }
}
