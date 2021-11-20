package chapter5.tugas;

public class Soal540 {
    public static void main(String[] args) {
        int heads, tails, coin;
        heads = tails = 0;

        System.out.println("Flipping a coin one million times... ");
        for (int i = 0; i < 1000000; i++) {
            coin = (int)(Math.random() * 2) == 0 ? heads++ : tails++;
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
