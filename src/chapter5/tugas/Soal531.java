package chapter5.tugas;

import java.util.Scanner;

public class Soal531 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double initialAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();

        System.out.println("\nMonth\tCD Value");

        for (int month = 1; month <= numberOfMonths; month++) {
            initialAmount = initialAmount + initialAmount * annualPercentageYield / 1200;
            System.out.printf("%d\t\t%.2f\n", month, initialAmount);
        }
    }
}
