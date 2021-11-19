package chapter5.tugas;

import java.util.Scanner;

public class Soal522 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = monthlyInterestRate(annualInterestRate);
        double monthlyPayment = monthlyPayment(loanAmount, monthlyInterestRate, numberOfYears);

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment(monthlyPayment, numberOfYears));

        double balance = loanAmount, principal, interest;

        System.out.println("Payment#     Interest     Principal     Balance");

        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-13d%8.2f%14.2f%13.2f\n", i, interest, principal, balance);
        }
    }

    public static double monthlyInterestRate(double air) {
        return air / 1200;
    }

    public static double monthlyPayment(double la, double mir, int noy) {
        return la * mir / (1 - 1 / Math.pow(1 + mir, noy * 12));
    }

    public static double totalPayment(double mp, int noy) {
        return (mp * 12) * noy;
    }
}
