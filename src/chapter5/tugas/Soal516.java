package chapter5.tugas;

import java.util.Scanner;

public class Soal516 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int index = 2;

        do {
            if (number % index == 0) {
                System.out.print(index + ", ");
                number /= index;
            }

            else {
                index++;
            }
        } while (number / index != 1);

        System.out.println(number);
    }
}
