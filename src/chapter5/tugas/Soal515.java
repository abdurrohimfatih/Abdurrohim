package chapter5.tugas;

public class Soal515 {
    public static void main(String[] args) {
        int countChar = 0;
        int i = 33;

        System.out.println();
        while (i <= 126) {
            countChar++;

            if (countChar % 10 == 0) System.out.println((char) i);
            else System.out.print((char) i + " ");

            i++;
        }
        System.out.println();
    }
}
