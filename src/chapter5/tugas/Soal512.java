package chapter5.tugas;

public class Soal512 {
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n, 2) < 12000) {
            n++;
        }

        System.out.println(n);
    }
}
