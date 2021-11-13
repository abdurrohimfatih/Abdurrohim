package chapter5.tugas;

public class Soal56 {
    public static void main(String[] args) {
        final double KMS_PER_MILE = 1.609;
        int miles1 = 1;
        int kms2 = 20;

        System.out.println("Miles    Kilometers   |   Kilometers    Miles");

        while (miles1 <= 10 && kms2 <= 65) {
            double kms1 = miles1 * KMS_PER_MILE;
            double miles2 = kms2 / KMS_PER_MILE;
            System.out.printf("%-9d%-10.3f", miles1, kms1);
            System.out.print("   |   ");
            System.out.printf("%-14d%.3f\n", kms2, miles2);
            miles1++;
            kms2 += 5;
        }
    }
}
