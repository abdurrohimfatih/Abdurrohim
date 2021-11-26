package chapter6.coba;

import java.util.Scanner;

public class SelectionSortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integer: ");
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        System.out.print("\nThe numbers is\t\t");
        printNumbers(a);

//        Mencetak selectionSort
        selectionSort(a);
        System.out.print("\nSelection sort is\t");
        printSelectionSort(a);
    }

    public static void printNumbers(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int k = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }

        return a;
    }

    public static void printSelectionSort(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
