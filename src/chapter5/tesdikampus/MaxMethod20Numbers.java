package chapter5.tesdikampus;

import java.util.Scanner;

public class MaxMethod20Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0, number;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            number = input.nextInt();

            result = max(number, result);
        }

        System.out.println("\nThe maximum is " + result);
    }

    public static int max(int number, int result) {
        int max = result;

        if (number > max) {
            max = number;
        }

        return max;
    }
}
