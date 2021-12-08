package tugasakhir.exercise1;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        double pi = 3.14;
        double luas;
        double r;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        r = input.nextDouble();

        luas = pi * r * r;

        System.out.println("Luas lingkaran adalah " + luas);
    }
}
