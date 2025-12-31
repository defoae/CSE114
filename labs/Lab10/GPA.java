package Lab10;

public class GPA {
    public static void main(String[] args) {
        System.out.println(gpaCalculator(new String[] {"A", "F", "C", "B"} ));
        System.out.println(gpaCalculator(new String[] {"A-", "B-", "C-", "F"} ) );
        System.out.println(gpaCalculator(new String[] {"F", "C+", "D+", "A+"} ));
    }

    public static Number gpaCalculator(String[] grades) {
        double sum = 0;
        for (String val : grades) {
            switch (val) {
                case ("A"): {
                    sum += 4.0;
                    break;
                }
                case ("A-"): {
                    sum += 3.67;
                    break;
                }
                case ("B+"): {
                    sum += 3.33;
                    break;
                }
                case ("B"): {
                    sum += 3.0;
                    break;
                }
                case ("B-"): {
                    sum += 2.67;
                    break;
                }
                case ("C+"): {
                    sum += 2.33;
                    break;
                }
                case ("C"): {
                    sum += 2;
                    break;
                }
                case ("C-"): {
                    sum += 1.67;
                    break;
                }
                case ("D+"): {
                    sum += 1.33;
                    break;
                }
                case ("D"): {
                    sum += 1;
                    break;
                }
                case ("F"): {
                    sum += 0;
                    break;
                }
                default: return -1;
            }
        }
        if (grades.length != 0) {
            return sum / grades.length;
        } else return -1;
    }
}
