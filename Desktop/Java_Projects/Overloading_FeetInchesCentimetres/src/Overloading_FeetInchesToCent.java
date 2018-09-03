public class Overloading_FeetInchesToCent {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimetres(25));
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double new_inches = feet * 12;
            return (inches + new_inches) * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {
        double new_feet = 0;
        double new_inches = inches % 12;

        if (inches >= 0) {
            for (int i=0; i<(inches-12); i+=12) {
                new_feet += 1;
            }
            return calcFeetAndInchesToCentimetres(new_feet, new_inches);
        } else {
            return -1;
        }
    }
}
