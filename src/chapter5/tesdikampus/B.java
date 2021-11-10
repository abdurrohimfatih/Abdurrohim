package chapter5.tesdikampus;

public class B {
    public static void main(String[] args) {
        for (int number = 2; number <= 47; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}