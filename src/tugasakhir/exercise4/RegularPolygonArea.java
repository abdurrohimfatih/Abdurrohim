package tugasakhir.exercise4;

import java.util.Scanner;

public class RegularPolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

//        Rumus menghitung luas poligon beraturan
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

//        Menampilkan hasilnya
        System.out.println("The area of the polygon is " + area);
    }
}
