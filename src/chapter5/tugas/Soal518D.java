package chapter5.tugas;

public class Soal518D {
    public static void main(String[] args) {
        System.out.println("Pattern D");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
