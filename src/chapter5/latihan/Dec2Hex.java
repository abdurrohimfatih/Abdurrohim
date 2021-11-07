package chapter5.latihan;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;

            char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            hex = hexDigit + hex;
            decimal /= 16;
            int a  = 0;
        }

        System.out.println("The hex number is " + hex);
    }
}
