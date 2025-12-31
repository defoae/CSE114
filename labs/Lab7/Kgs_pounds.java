package Lab7;

public class Kgs_pounds {
    public static void main(String[] arhs) {
        System.out.println("Killograms\t\tPounds\t\tKilograms\t\tPounds");
        for (int k = 1, p =20; k <= 199 && p<=515; k++, p=p+5) {
            double kToP = k*2.2;
            double pToK = p/2.2;

            System.out.printf("%d\t\t\t\t%.1f.\t\t\t\t%d\t\t\t\t%.2f\n", k, kToP, p, pToK);
        }
    }
}