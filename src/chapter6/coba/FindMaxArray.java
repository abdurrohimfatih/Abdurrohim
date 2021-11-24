package chapter6.coba;

import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integer: ");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = input.nextInt();
        }

        for (int j : a) {
            System.out.print(j + " ");
        }

        int max = a[1];
        int min = a[1];
        for (int i = 0; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a [i];
            }
        }

        int total = 0;
        for (int k : a) {
            total += a[k];
        }

        System.out.println("\nThe maximum is " + max);
        System.out.println("The minimum is " + min);
        System.out.println("The total is " + total);

//        Mencetak selectionSort
        int[] x = selectionSort(a);

        System.out.print("\nSelection sort is\t");
        for (int l : x) {
            System.out.print(l + " ");
        }

//        Mencetak heapSort
        heapSort(a);

        System.out.print("\nHeap sort is\t\t");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static int[] selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++) {
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

    public static void heapSort(int[] a) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a, i, 0);
        }
    }

    public static void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && a[l] > a[largest]) {
            largest = l;
        }

        if (r < n && a[r] > a[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            heapify(a, n, largest);
        }
    }
}
