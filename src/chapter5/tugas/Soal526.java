package chapter5.tugas;

public class Soal526 {
    public static void main(String[] args) {
        double e = 1.0;

        for (int i = 1; i <= 20; i++) {
            double d = i;

            for (double k = i - 1; k >= 1; k--) {
                d *= k;
            }

            e += 1 / d;

            System.out.println("Nilai e untuk i = " + i + " adalah " + e);
        }
    }
}
