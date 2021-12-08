package tugasakhir.exercise6;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome");
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";             // Untuk convert number menjadi String

//        Balikkan
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }

        return Integer.parseInt(reverse);
    }
}
