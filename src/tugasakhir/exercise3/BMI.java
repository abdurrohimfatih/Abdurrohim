package tugasakhir.exercise3;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.453592;
        final double METERS_PER_INCH = 0.0254;
        final double FEET_PER_INCH = 0.0833333;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();;

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

//        Mengkonversi berat badan dari pound ke kilogram
        weight *= KILOGRAMS_PER_POUND;

//        Menghitung tinggi badan
        double height = (inches + feet / FEET_PER_INCH) * METERS_PER_INCH;

//        Hitung Body Mass Index
        double bmi = weight / Math.pow(height, 2);

//        Tampilkan hasilnya
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
