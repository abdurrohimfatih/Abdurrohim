package chapter5.tugas;

public class Soal519 {
    public static void main(String[] args) {
        int startRight = 0, endSpace = 7;

        for (int row = 1; row <= 128; row += row) {
            for (int startSpace = 0; startSpace < endSpace; startSpace++) {
                System.out.print("    ");
            }

            for (int asc = 1; asc <= row; asc += asc) {
                System.out.printf("%4d", (asc));
            }

            for (int desc = startRight; desc > 0; desc /= 2) {
                System.out.printf("%4d", (desc));
            }

            System.out.println();

            endSpace--;
            startRight = row;
        }
    }
}
