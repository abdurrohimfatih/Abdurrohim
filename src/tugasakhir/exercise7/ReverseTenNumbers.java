package tugasakhir.exercise7;

import java.util.Scanner;

public class ReverseTenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        reverse(a);
    }

    public static void reverse(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
