package tugasakhir.exercise3;

import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Generate angka satu digit secara acak (0 - 9)
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

//        Menanyakan kepada user jawabannya
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

//        Menampilkan hasilnya (true atau false)
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                (number1 + number2 + number3 == answer));
    }
}
