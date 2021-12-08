package tugasakhir.exercise1;

import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        double r, t, v;
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Volume Tabung");
        System.out.println("=================================");

        System.out.print("Masukkan jari-jari tabung: ");
        r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        t = input.nextDouble();

        v = PI * r * r * t;

        System.out.println("Volume tabung adalah " + v);
    }
}
