package tugasakhir.exercise6;

public class PentagonalNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONALS = 100;
        final int NUMBER_PER_LINE = 10;

        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
            System.out.printf("%7d", getHexagonalNumber(i));

//            Jika sudah ada 10 angka, buat baris baru
            if (i % NUMBER_PER_LINE == 0)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }

    public static int getHexagonalNumber(int n) {
        return n * (2 * n - 1);
    }
}
