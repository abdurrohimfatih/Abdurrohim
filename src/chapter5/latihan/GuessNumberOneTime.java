package chapter5.latihan;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Generate angka acak yang akan ditebak
        int number = (int) (Math.random() * 101);
        System.out.println("Guess a magic number between 0 and 100");

//        Minta user untuk memasukkan angka tebakannya
        System.out.print("\nEnter your guess: ");
        int guess = input.nextInt();

        if (guess == number) System.out.println("Yes, the number is " + number);
        else if (guess > number) System.out.println("Your guess is too high");
        else System.out.println("Your guess is too low");
    }
}
