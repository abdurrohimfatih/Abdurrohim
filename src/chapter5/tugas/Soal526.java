package chapter5.tugas;

public class Soal526 {
    public static void main(String[] args) {

        for (double i = 1.0; i <= 20.0; i++) {
            double e = 0.0;

            for (double j = 1; j <= i; j++) {
                double d = j;
                for (double k = j - 1; k >= 1; k--) {
                    d *= k;
                }
                e += 1 / d;
            }

            System.out.println("Nilai e untuk i = " + (int) i + " is " + e);
        }
    }
}
