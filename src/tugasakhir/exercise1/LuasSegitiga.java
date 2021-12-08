package tugasakhir.exercise1;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        int alas;
        int tinggi;
        float luasSegitiga;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai alas segitiga: ");
        alas = input.nextInt();

        System.out.print("Masukkan nilai tinggi segitiga: ");
        tinggi = input.nextInt();

        luasSegitiga = (float) (0.5 * alas * tinggi);

        System.out.println("Luas segitiga adalah " + luasSegitiga);
    }
}
