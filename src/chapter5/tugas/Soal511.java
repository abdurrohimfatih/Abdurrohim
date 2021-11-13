package chapter5.tugas;

public class Soal511 {
    public static void main(String[] args) {
        int countNumberDivisible = 0;
        int number = 100;

        while (number <= 200) {
            if (number % 5 == 0 || number % 6 == 0) {
                countNumberDivisible++;

                if (countNumberDivisible % 10 == 0) System.out.println(number);
                else System.out.print(number + " ");
            }

            number++;
        }
    }
}
