package tugasakhir.exercise4;

import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

//        Menghitung panjang sisi
        double s = 2 * r * Math.sin(Math.PI / 5);

//        Menghitung luas pentagon
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

//        Menampilkan hasilnya
        System.out.printf("%s%.2f", "The area of the pentagon is ", area);
    }
}
