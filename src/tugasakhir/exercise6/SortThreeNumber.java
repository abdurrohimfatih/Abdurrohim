package tugasakhir.exercise6;

import java.util.Scanner;

public class SortThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        displaySortedNumbers(a, b, c);
    }

    public static void displaySortedNumbers(double n1, double n2, double n3) {
        double temp;

        if (n2 < n1 && n2 < n3) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        else if (n3 < n1 && n3 < n2) {
            temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if (n3 < n2) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }

        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
