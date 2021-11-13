package chapter5.tugas;

public class Soal57 {
    public static void main(String[] args) {
        int totalCost = 0;
        int tuition = 10000;
        int tuitionTenthYear = 0;
        int year = 1;

        while (year <= 14) {
            tuition += tuition * 0.05;

            if (year == 10) tuitionTenthYear += tuition;
            if (year > 10) totalCost += tuition;

            year++;
        }

        System.out.println("Tuition in 10 years: $" + tuitionTenthYear);
        System.out.println("Total cost of four years’ worth of tuition starting after the tenth year: $" +
                totalCost);
    }
}
