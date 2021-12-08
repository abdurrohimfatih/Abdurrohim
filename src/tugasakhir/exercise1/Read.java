package tugasakhir.exercise1;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b, c;

        System.out.print("Masukkan kata 1: ");
        a = input.nextLine();
        System.out.print("Masukkan kata 2: ");
        b = input.nextLine();

        c = a + " " + b;

        System.out.println("Kata yang Anda masukkan adalah " + c);
    }
}
