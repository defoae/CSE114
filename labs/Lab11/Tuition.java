package Lab11;

public class Tuition {
    public static void main(String[] args) {
        calculateTuition();
    }

    public static void calculateTuition(){
        int tutionCost = 10000;
        int temp = 0;
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            tutionCost = (int) (tutionCost * 1.05);
            if (i == 9) {
                temp = tutionCost;
            }
            if (i >= 9) {
                sum += tutionCost;
            }
        }
        System.out.println("Tuition per year after 10 years went from 10,000 to: " + temp);
        System.out.println("Full cost of university for 4 years after 10 years from the start of increasing from 10,000 is: "+sum);
    }
}
