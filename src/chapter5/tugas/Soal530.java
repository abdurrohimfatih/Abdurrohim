package chapter5.tugas;

import java.util.Scanner;

public class Soal530 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g., 6): ");
        int numberOfMonths = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        System.out.print("\nThe amount in the savings account after " + numberOfMonths + " months is $");
        System.out.printf("%.3f\n",
                amountAfterGivenMonth(amount, monthlyInterestRate, numberOfMonths));
    }

    public static double amountAfterGivenMonth(double a, double mir, int nom) {
        double total = 0;
        for (int month = 1; month <= nom; month++) {
            total = (a + total) * (1 + mir);
        }

        return total;
    }
}
