package Lab24;

public class SelectionSortRecursive {
    public static void main(String[] args){
        int[] a = new int[]{1, 3, 2, 7, 9, 4};
        selSort(a);
        for(int e : a){
           System.out.print(e + " ");
        };
    }

    public static void sort(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[j] > a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void selSort(int[] a){
        selSorthelper(a, 0);
    }

    public static void selSorthelper(int[] a, int index){
        if(index < a.length){
            selHelp2(a, index  +1, index);

            //recursive call
            selSorthelper(a, index + 1);
        }
        // return nothing
    }

    public static void selHelp2(int[] a, int j, int i){
        if(j < a.length) {
            if (a[j] < a[i]) {
                //swapping
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                // recursive call
                selHelp2(a, j, i);
            }
            else
                selHelp2(a, j + 1, i);
        }
    }
}
