package tugasakhir.exercise1;

public class TukarIsiEmber {
    public static void main(String[] args) {
        String emberA;
        String emberB;
        String emberC;

        emberA = "kopi";
        emberB = "susu";

        System.out.println("Kondisi ember sebelum ditukar");
        System.out.println("Isi ember A adalah " + emberA);
        System.out.println("Isi ember B adalah " + emberB);

        emberC = emberA;
        emberA = emberB;
        emberB = emberC;

        System.out.println("==============================");
        System.out.println("Kondisi ember setelah ditukar");
        System.out.println("Isi ember A adalah " + emberA);
        System.out.println("Isi ember B adalah " + emberB);
    }
}
