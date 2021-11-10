package chapter5.coba;

public class TestFor513 {
    public static void main(String[] args) {
        int sum = 0;

        for (int number = 0; number < 20; number++) {
            if (number == 10 || number == 11) continue;
            sum += number;
        }

        System.out.println("The sum is " + sum);
    }
}
