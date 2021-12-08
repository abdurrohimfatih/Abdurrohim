package tugasakhir.exercise5;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

//        Jika angka yang dimasukkan = 0, maka selesai
        if (number == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

//        Jika angka yang dimasukkan != 0, maka lakukan perulangan
        while (number != 0) {
            if (number > 0) positives++;
            else negatives++;
            total += number;
            count++;
            number = input.nextInt();
        }

//        Hitung rata-ratanya
        double average = total / count;

//        Tampilkan hasilnya
        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
