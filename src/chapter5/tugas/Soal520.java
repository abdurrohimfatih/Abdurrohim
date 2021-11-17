package chapter5.tugas;

public class Soal520 {
    public static void main(String[] args) {
        int count = 0;

        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;

                if (count % 8 == 0) {
                    System.out.println(number);
                }
                else {
                    System.out.printf("%-5d", number);
                }
            }
        }
    }
}
