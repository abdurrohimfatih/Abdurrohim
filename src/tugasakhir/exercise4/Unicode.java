package tugasakhir.exercise4;

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String s = input.nextLine();

//        Untuk mengambil karakter pertama dari string yang diinputkan
        char c = s.charAt(0);

//        Menampilkan hasilnya
        System.out.println("The Unicode for the character " + s + " is " + (int) c);
    }
}
