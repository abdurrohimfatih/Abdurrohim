package tugasakhir.quiz1;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.454;

        double kilograms = pounds * KILOGRAMS_PER_POUND;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
