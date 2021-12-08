package tugasakhir.exercise6;

public class DisplayCharacters {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 10;
        char ch1 = '1';
        char ch2 = 'Z';

        System.out.println();
        printChars(ch1, ch2, NUMBER_PER_LINE);
        System.out.println();
    }
    
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 1;
        for (char c = ch1; c <= ch2; c++) {
            if (count % numberPerLine == 0)
                System.out.println(c);
            else
                System.out.print(c + " ");

            count++;
        }
    }
}
