package chapter5.tugas;

import java.util.Scanner;

public class Soal51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;

//        Minta user untuk memasukkan bilangan bulat
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        do {
            if (number > 0) positives++;
            else negatives++;
            total += number;
            count++;
            number = input.nextInt();
        } while (number != 0);

        double average = total / count;

//        Tampilkan hasilnya
        System.out.println("The number of positives is " + positives +
                "\nThe number of negatives is " + negatives +
                "\nThe total is total " + total +
                "\nThe average is " + average);
    }
}
