package chapter5.tugas;

public class Soal535 {
    public static void main(String[] args) {
        double sum = 0.0;

        for (double i = 1.0; i <= 624.0; i++) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }

        System.out.println("The sum is " + sum);
    }
}
