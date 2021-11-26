package chapter6.coba;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integer: ");
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        for (int j : a) {
            System.out.print(j + " ");
        }

        int largest = a[1];
        int smallest = a[1];
        for (int j : a) {
            if (j > largest) {
                largest = j;
            }

            if (j < smallest) {
                smallest = j;
            }
        }

        int total = 0;
        for (int j : a) {
            total += j;
        }

        System.out.println("\nThe largest is " + largest);
        System.out.println("The smallest is " + smallest);
        System.out.println("The total is " + total);
    }
}
