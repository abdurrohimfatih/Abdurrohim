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

        System.out.print("\nThe numbers is\t\t");
        printNumbers(a);

        System.out.println("\nThe largest is\t\t" + largest(a));
        System.out.println("The smallest is\t\t" + smallest(a));
        System.out.println("The total is\t\t" + total(a));
    }

    public static void printNumbers(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static int largest(int[] a) {
        int largest = a[1];

        for (int i : a) {
            if (i > largest) {
                largest = i;
            }
        }

        return largest;
    }

    public static int smallest(int[] a) {
        int smallest = a[1];

        for (int i : a) {
            if (i < smallest) {
                smallest = i;
            }
        }

        return smallest;
    }

    public static int total(int[] a) {
        int total = 0;

        for (int i : a) {
            total += i;
        }

        return total;
    }
}
