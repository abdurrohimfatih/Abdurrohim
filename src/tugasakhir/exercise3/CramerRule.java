package tugasakhir.exercise3;

import java.util.Scanner;

public class CramerRule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Minta user untuk memasukkan nilai a,b,c,d,e, dan f
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

//        Jika ad - bc = 0
        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution");
        }

//        Jika ad - bc != 0, hitung penyelesaiannya dengan metode Cramer
        else {
//            Rumus: x = ed - bf dibagi ad - bc
            double x = (e * d - b * f) / (a * d - b * c);

//            Rumus: y = af - ec dibagi ad - bc
            double y = (a * f - e * c) / (a * d - b * c);

//            Menampilkan hasilnya
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
