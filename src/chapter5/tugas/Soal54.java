package chapter5.tugas;

public class Soal54 {
    public static void main(String[] args) {
        final double KMS_PER_MILE = 1.609;
        int miles = 1;

        System.out.println("Miles     Kilometers");

        while (miles <= 10) {
            double kms = miles * KMS_PER_MILE;
            System.out.printf("%-10d%.3f\n", miles, kms);
            miles++;
        }
    }
}
