package chapter5.tesdikampus;

public class D {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {

//            Membuat spasi
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }

//            Membuat bintang
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
