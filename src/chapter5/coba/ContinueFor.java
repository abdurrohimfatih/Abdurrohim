package chapter5.coba;

public class ContinueFor {
    public static void main(String[] args) {
        for (int number = 1; number <= 20; number++) {
            if (number == 10) {
                continue;
            }
            System.out.print(number + " ");
        }
    }
}
