package chapter5.tesdikampus;

import java.util.Scanner;

public class MaxMethod3Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = input.nextInt();
        System.out.print("Enter the second integer: ");
        int b = input.nextInt();
        System.out.print("Enter the third integer: ");
        int c = input.nextInt();

        int result = max(a, b, c);

        System.out.println("\nThe maximum between " + a + ", " + b + ", and " + c + " is " + result);
    }

    public static int max(int num1, int num2, int num3) {
        int result;

        if (num1 > num2 && num1 > num3) {
            result = num1;
        }

        else if (num2 > num1 && num2 > num3) {
            result = num2;
        }

        else {
            result = num3;
        }

        return result;
    }
}
