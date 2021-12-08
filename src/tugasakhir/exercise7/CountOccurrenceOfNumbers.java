package tugasakhir.exercise7;

import java.util.Scanner;

public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[100];

        System.out.print("Enter the integers between 1 and 100: ");
        int num;
        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100) {
                counts[num - 1]++;
            }
        } while (num != 0);

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }
    }
}
