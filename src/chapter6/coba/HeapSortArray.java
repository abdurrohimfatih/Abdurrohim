package chapter6.coba;

import java.util.Scanner;

public class HeapSortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integer: ");
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        System.out.print("\nThe numbers is\t\t");
        for (int j : a) {
            System.out.print(j + " ");
        }

//        Mencetak heapSort
        heapSort(a);

        System.out.print("\nHeap sort is\t\t");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void heapSort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapify(a, a.length, i);
        }
        for (int i = a.length - 1; i > 0; i--) {
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
