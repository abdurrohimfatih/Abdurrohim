package tugasakhir.exercise5;

public class KilogramsToPounds {
    public static void main(String[] args) {
        final double POUNDS_PER_KG = 2.2;
        int kgs = 1;

        System.out.println("Kilograms    Pounds");

        while (kgs <= 199) {
            double pounds = kgs * POUNDS_PER_KG;
            System.out.printf("%-13d%6.1f\n", kgs, pounds);
            kgs += 2;
        }
    }
}
