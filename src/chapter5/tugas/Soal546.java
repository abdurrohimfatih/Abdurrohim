package chapter5.tugas;

import java.util.Scanner;

public class Soal546 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        System.out.println("The reversed string is " + reverse);
    }
}
