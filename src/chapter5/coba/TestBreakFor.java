package chapter5.coba;

public class TestBreakFor {
    public static void main(String[] args) {
        for (int number = 1; number < 20; number++) {
            if (number == 10) {
                break;
            }
            System.out.print(number + " ");
        }
    }
}
