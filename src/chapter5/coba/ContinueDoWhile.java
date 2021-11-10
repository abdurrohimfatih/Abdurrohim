package chapter5.coba;

public class ContinueDoWhile {
    public static void main(String[] args) {
        int number = 0;

        do {
            number++;
            if (number == 10) {
                continue;
            }
            System.out.print(number + " ");
        } while (number < 20);
    }
}
