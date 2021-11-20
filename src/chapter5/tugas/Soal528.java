package chapter5.tugas;

import java.util.Scanner;

public class Soal528 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year (0 - 6, 0 for Sunday): ");
        int firstDay = input.nextInt();

        System.out.println("=====================================================");

        for (int month = 1; month <= 12; month++) {
            String monthName = "";
            switch (month) {
                case 1 -> monthName = "January";
                case 2 -> monthName = "February";
                case 3 -> monthName = "March";
                case 4 -> monthName = "April";
                case 5 -> monthName = "May";
                case 6 -> monthName = "June";
                case 7 -> monthName = "July";
                case 8 -> monthName = "August";
                case 9 -> monthName = "September";
                case 10 -> monthName = "October";
                case 11 -> monthName = "November";
                case 12 -> monthName = "December";
            }

            firstDay %= 7;

            String dayName = "";
            switch (firstDay) {
                case 0 -> dayName = "Sunday";
                case 1 -> dayName = "Monday";
                case 2 -> dayName = "Tuesday";
                case 3 -> dayName = "Wednesday";
                case 4 -> dayName = "Thursday";
                case 5 -> dayName = "Friday";
                case 6 -> dayName = "Saturday";
            }

            System.out.println(monthName + " 1, " + year + " is " + dayName);

            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                firstDay += 31;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                firstDay += 30;
            }
            else {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    firstDay += 29;
                }
                else {
                    firstDay += 28;
                }
            }
        }
    }
}