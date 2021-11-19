package chapter5.tugas;

public class Soal523 {
    public static void main(String[] args) {
        double sumLeftToRight = 0.0;
        double sumRightToLeft = 0.0;

        for (double i = 1.0; i <= 50000.0; i++) {
            sumLeftToRight += 1 / i;
        }

        System.out.println("Summation of series left to right: " + sumLeftToRight);

        for (double i = 50000.0; i >= 1.0; i--) {
            sumRightToLeft += 1 / i;
        }

        System.out.println("Summation of series right to left: " + sumRightToLeft);

        System.out.println("Summation of the series right to left - Summation of the series left to right: " +
                (sumRightToLeft - sumLeftToRight));
    }
}
