package chapter5.coba;

public class TestBreakDoWhile {
    public static void main(String[] args) {
        int number = 0;

        do {
            number++;
            if (number == 10) {
                break;
            }
            System.out.print(number + " ");
        } while (number < 20);
    }
}
