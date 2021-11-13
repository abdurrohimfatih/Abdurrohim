package chapter5.tugas;

import java.util.Scanner;

public class Soal517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int rows = 1; rows <= lines; rows++) {
            for (int spaces = lines - rows; spaces >= 1; spaces--) {
                System.out.print("  ");
            }
            
            for (int desc = rows; desc >= 2; desc--) {
                System.out.print(desc + " ");
            }

            for (int asc = 1; asc <= rows; asc++) {
                System.out.print(asc + " ");
            }
            
            System.out.println();
        }
    }
}
