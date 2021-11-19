package chapter5.tugas;

public class Soal524 {
    public static void main(String[] args) {
        double sum = 0.0;

        for (double i = 1.0; i <= 97.0; i += 2) {
            sum += i / (i + 2);
        }

        System.out.println("Sum of the series: " + sum);
    }
}
