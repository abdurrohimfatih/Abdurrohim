package tugasakhir.exercise8;

import java.util.Scanner;

public class SumMajorDiagonal {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
    
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        final int ROWS = 4;
        final int COLS = 4;
        double[][] m = new double[ROWS][COLS];

        System.out.println("Enter a " + ROWS + "-by-" + COLS + " matrix row by row: ");
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                m[row][col] = input.nextDouble();
            }
        }

        return m;
    }
    
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }

        return sum;
    }
}
