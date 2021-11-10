package chapter5.coba;

public class ContinueWhile {
    public static void main(String[] args) {
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10) {
                continue;
            }
            System.out.print(number + " ");
        }
    }
}
