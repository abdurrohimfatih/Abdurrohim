package tugasakhir.exercise7;

import java.util.Scanner;

public class AverageAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];

        System.out.print("Enter ten values of double type: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        System.out.println("The average value is " + average(values));
    }
    
    public static int average(int[] a) {
        int average = 0;
        for (int i : a) {
            average += i;
        }

        return average / a.length;
    }
    
    public static double average(double[] a) {
        double average = 0;
        for (double i : a) {
            average += i;
        }

        return average / a.length;
    }
}
