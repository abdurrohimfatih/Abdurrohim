package chapter5.tugas;

public class Soal527 {
    public static void main(String[] args) {
        int i = 0;

        for (int year = 101; year <= 2100; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                i++;
                System.out.print(year);
                if (i % 10 == 0) System.out.println();
                else System.out.print(" ");
            }
        }
    }
}
