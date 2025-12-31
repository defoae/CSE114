package Lab11;

public class Rolling {
    public static void main(String[] args){
        dice();
    }
    public static void dice(){
        int a, b;
        a = (int)(Math.random() * 6 + 1);
        b = (int)(Math.random() * 6 + 1);
        System.out.println("The first die comes up "+a);
        System.out.println("The second die comes up "+b);
        System.out.println("The total roll is " + (a+b));
    }
}
