package chapter5.tugas;

import java.util.Scanner;

public class Soal529 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year (0 - 6, 0 for Sunday): ");
        int day = input.nextInt();

        System.out.println("=====================================================");

        for (int month = 1; month <= 12; month++) {
            String title = "";
            switch (month) {
                case 1 -> title += "January";
                case 2 -> title += "February";
                case 3 -> title += "March";
                case 4 -> title += "April";
                case 5 -> title += "May";
                case 6 -> title += "June";
                case 7 -> title += "July";
                case 8 -> title += "August";
                case 9 -> title += "September";
                case 10 -> title += "October";
                case 11 -> title += "November";
                case 12 -> title += "December";
            }

            title += " " + year;

            for (int i = 0; i < 23 - (title.length() / 2); i++) {
                System.out.print(" ");
            }

            System.out.println(title);
            System.out.println("---------------------------------------------");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");

            day %= 7;

            for (int i = 0; i <= day * 7; i++) {
                System.out.print(" ");
            }

            int lastDay = 0;
            if ( month == 1 || month == 3  || month == 5 || month == 7 ||
                    month == 8 || month == 10 ||month == 12)
                lastDay += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                lastDay += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    lastDay += 29;
                else
                    lastDay += 28;
            }

            for (int d = 1; d <= lastDay; d++) {
                if (d < 10) {
                    System.out.print(" ");
                }
                if (day % 7 == 6) {
                    System.out.print(d + "\n ");
                }
                else {
                    System.out.print(d + "     ");
                    if (d == lastDay) {
                        System.out.println();
                    }
                }

                day++;
            }

            System.out.println();
        }
    }
}
