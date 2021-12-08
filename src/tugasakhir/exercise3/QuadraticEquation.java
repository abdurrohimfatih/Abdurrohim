package tugasakhir.exercise3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

//        Rumus untuk menghitung diskriminan
        double d = Math.pow(b, 2) - 4 * a * c;

//        Rumus untuk menghitung akar-akar dari persamaan kuadrat
        double r1 = (-b + Math.pow(d, 0.5)) / 2 * a;
        double r2 = (-b - Math.pow(d, 0.5)) / 2 * a;

//        Menampilkan hasilnya
        System.out.print("The equation has ");
        if (d > 0) System.out.printf("%s%.6f%s%.5f", "two roots ", r1, " and ", r2);
        else if (d == 0) System.out.println("one root " + r1);
        else System.out.println("no real roots");
    }
}
