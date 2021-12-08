package tugasakhir.exercise4;

import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

//        Rumus menghitung luas hexagon
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

//        Menampilkan hasilnya
        System.out.printf("%s%.2f", "The area of the hexagon is ", area);
    }
}
