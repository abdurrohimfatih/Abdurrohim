package chapter5.tugas;

import java.util.Scanner;

public class Soal521 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate       Monthly Payment     Total Payment");

        for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.printf("%-5.3f", i);
            System.out.print("%              ");
            double monthlyInterestRate = monthlyInterestRate(i);
            double monthlyPayment = monthlyPayment(loanAmount, monthlyInterestRate, numberOfYears);
            System.out.printf("%-20.2f", monthlyPayment);
            System.out.printf("%-8.2f\n", totalPayment(monthlyPayment, numberOfYears));
        }
    }

    public static double monthlyInterestRate(double i) {
        return i / 1200;
    }

    public static double monthlyPayment(double la, double mir, int noy) {
        return la * mir / (1 - 1 / Math.pow(1 + mir, noy * 12));
    }

    public static double totalPayment(double mp, int noy) {
        return (mp * 12) * noy;
    }
}
