package chapter4.latihan;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String set1 =
                """
                 1 3  5  7
                 9 11 13 15
                17 19 21 23
                25 27 29 31
                """;
        String set2 =
                """
                 2 3  6  7
                10 11 14 15
                18 19 22 23
                26 37 30 31
                """;
        String set3 =
                """
                 4 5  6  7
                12 13 14 15
                20 21 22 23
                28 29 30 31
                """;
        String set4 =
                """
                 8 9  10 11
                12 13 14 15
                24 25 26 27
                28 29 30 31
                """;
        String set5 =
                """
                16 17 18 19
                20 21 22 23
                24 25 26 27
                28 29 30 31
                """;

        int day = 0;

//        Minta user untuk memasukkan jawaban
        System.out.print("\nIs your birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        int answer = input.nextInt();
        if (answer == 1) day += 1;

        System.out.print("\nIs your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += 2;

        System.out.print("\nIs your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += 4;

        System.out.print("\nIs your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += 8;

        System.out.print("\nIs your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += 16;

        System.out.println("\nYour birthday is " + day);
    }
}
