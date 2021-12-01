package chapter7.tugasdikampus;

import java.util.Arrays;

public class LatihanArrayAbdurrohim {
    public static void main(String[] args) {
        int[] arrayAngka1 = {5,2,49,11,6,3,80,7,9};
        int[] arrayAngka2 = {8,9,19,6,90,2,0,72,4};

//        menjumlahkan dua buah array
        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil1, "hasil 1");

//        menggabungkan dua buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }

        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil2, "hasil 2");

//        mengurutkan dari terbesar ke terkecil
        printArray(arrayAngka1, "array 1");
        reverse(arrayAngka1);
        printArray(arrayAngka1, "reverse");

        printArray(arrayAngka2, "array 2");
        reverse(arrayAngka2);
        printArray(arrayAngka2, "reverse2");
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }
    
    private static void printArray(int[] dataArray, String message) {
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }

    private static void reverse(int[] dataArray) {
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }

    private static void reverse2(int[] dataArray) {
        Arrays.sort(dataArray);
        for (int i = 0; i < dataArray.length / 2; i++) {
            int buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }
}
