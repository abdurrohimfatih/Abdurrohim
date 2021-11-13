package chapter5.tugas;

public class Soal55 {
    public static void main(String[] args) {
        final double POUNDS_PER_KG = 2.2;
        int kgs1 = 1;
        int pounds2 = 20;

        System.out.println("Kilograms    Pounds   |   Pounds    Kilograms");

        while (kgs1 <= 199 && pounds2 <= 515) {
            double pounds1 = kgs1 * POUNDS_PER_KG;
            double kgs2 = pounds2 / POUNDS_PER_KG;
            System.out.printf("%-13d%5.1f", kgs1, pounds1);
            System.out.print("    |   ");
            System.out.printf("%-6d%10.2f\n", pounds2, kgs2);
            kgs1 += 2;
            pounds2 += 5;
        }
    }
}
