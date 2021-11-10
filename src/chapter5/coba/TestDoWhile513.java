package chapter5.coba;

public class TestDoWhile513 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        do {
            number++;
            if (number == 10 || number == 11) continue;
            sum += number;
        } while (number < 20);

        System.out.println("The sum is " + sum);
    }
}
