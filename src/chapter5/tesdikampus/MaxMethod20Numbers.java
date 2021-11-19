package chapter5.tesdikampus;

import java.util.Scanner;

public class MaxMethod20Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int number = input.nextInt();

            result = max(number, result);
        }

        System.out.println("\nThe maximum is " + result);
    }

    public static int max(int number, int result) {
        if (number > result) {
            return result = number;
        }
        else {
            return result;
        }
    }
}
