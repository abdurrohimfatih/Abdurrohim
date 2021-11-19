package chapter5.latihan;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        switch (month) {
            case 1 -> System.out.print("\t\tJanuary ");
            case 2 -> System.out.print("\t\tFebruary ");
            case 3 -> System.out.print("\t\tMarch ");
            case 4 -> System.out.print("\t\tApril ");
            case 5 -> System.out.print("\t\tMay ");
            case 6 -> System.out.print("\t\tJune ");
            case 7 -> System.out.print("\t\tJuly ");
            case 8 -> System.out.print("\t\tAugust ");
            case 9 -> System.out.print("\t\tSeptember ");
            case 10 -> System.out.print("\t\tOctober ");
            case 11 -> System.out.print("\t\tNovember ");
            case 12 -> System.out.print("\t\tDecember ");
        }

        System.out.print(year);
        System.out.println("\n-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");


    }
}
