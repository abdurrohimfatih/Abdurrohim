package chapter6.coba;

import java.util.Scanner;

public class BubbleSortArray {
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

//        Mencetak bubbleSort
        bubbleSort(a);

        System.out.print("\nBubble sort is\t\t");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
