package chapter5.coba;

public class LatihanWhile {
    public static void main(String[] args) {
        int count = 0;
        while (count < 0) {
            System.out.println("Abdurrohim " + count);
            count++;
        }

        int count2 = 0;
        do {
            System.out.println("Ohim " + count2);
            count2++;
        } while (count2 < 0);
    }
}
