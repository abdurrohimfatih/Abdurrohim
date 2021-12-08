package tugasakhir.exercise8;

import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();

        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
        }
    }
    
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
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
    
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }

        return sum;
    }
}
