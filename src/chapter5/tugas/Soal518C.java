package chapter5.tugas;

public class Soal518C {
    public static void main(String[] args) {
        System.out.println("Pattern C");

        for (int i = 1; i <= 6; i++) {
            for (int j = 6 - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
