package chapter5.tugas;

public class Soal525 {
    public static void main(String[] args) {
        for (double i = 10000.0; i <= 100000.0; i += 10000.0) {
            double sum = 0;

            for (double d = 1; d <= (2 * i - 1); d += 2) {
                sum += 1 / d;
                d += 2;
                sum -= 1 / d;
            }

            double pi = 4 * sum;

            System.out.println("Nilai PI untuk i = " + (int) i + " adalah " + pi);
        }
    }
}
