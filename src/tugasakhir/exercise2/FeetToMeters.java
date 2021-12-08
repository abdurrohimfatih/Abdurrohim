package tugasakhir.exercise2;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        final double METERS_PER_FEET = 0.305;

        double meter = feet * METERS_PER_FEET;

        System.out.println(feet + " feet is " + meter + " meters");
    }
}
