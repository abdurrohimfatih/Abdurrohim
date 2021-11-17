package chapter5.tesdikampus;

import java.util.Scanner;

public class MaxMethod2Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int i = input.nextInt();
        System.out.print("Enter the second integer: ");
        int j = input.nextInt();

        int k = max(i, j);

        System.out.println("\nThe maximum between " + i + " and " + j + " is " + k);
    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }

        return result;
    }
}
