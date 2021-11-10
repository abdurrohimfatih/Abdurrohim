package chapter5.coba;

public class TestBreakWhile {
    public static void main(String[] args) {
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10) {
                break;
            }
            System.out.print(number + " ");
        }
    }
}
