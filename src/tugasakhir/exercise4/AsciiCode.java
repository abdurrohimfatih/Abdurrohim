package tugasakhir.exercise4;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();

        System.out.println("The character for ASCII code " + ascii + " is " + (char) ascii);
    }
}
