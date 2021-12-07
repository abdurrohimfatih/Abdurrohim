package tugasakhir.quiz1;

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        final double PI = 3.14159;

        double area = PI * radius * radius;
        double volume = area * length;

        System.out.printf("%s%.4f", "The area is ", area);
        System.out.printf("\n%s%.1f","The volume is ", volume);
    }
}
