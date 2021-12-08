package tugasakhir.exercise7;

import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter scores (negative number signifies end): ");
        int[] scores = new int[100];
        int num;
        int numberOfScores = 0;
        int average;
        int total = 0;
        int aboveOrEqual = 0;
        int below = 0;

        for (int i = 0; i < 100; i++) {
            num = input.nextInt();

            if (num < 0) {
                break;
            }

            scores[i] = num;
            total += num;
            numberOfScores++;
        }

        average = total / numberOfScores;

        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            }
            else {
                below++;
            }
        }

        System.out.println("Average of scores is " + average);
        System.out.println("Number of scores above or equal to average is " + aboveOrEqual);
        System.out.println("Number of scores below average is " + below);
    }
}
