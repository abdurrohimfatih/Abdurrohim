package tugasakhir.exercise5;

import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int max = 0;

        System.out.print("Enter numbers: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (number != 0) {
            if (number > max) {
                max = number;
            }
            else if (number == max) {
                count++;
            }

            number = input.nextInt();
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
