package chapter5.tugasdikampus;

public class C {
    public static void main(String[] args) {
        int i = 2;
        int j = 6;

        while (j <= 38) {
            while (i <= 200) {
                System.out.print(i + " ");
                i = i + j;
                j = j + 4;
            }
        }
    }
}
