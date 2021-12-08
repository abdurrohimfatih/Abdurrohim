package tugasakhir.exercise3;

public class GenerateMonth {
    public static void main(String[] args) {
//        Generate angka dari 1 - 12 secara acak
        int month = (int) ((Math.random() * 12) + 1);

//        Ubah angka tersebut menjadi nama bulan dalam bahasa Inggris
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }
}
