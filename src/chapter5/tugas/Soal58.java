package chapter5.tugas;

import java.util.Scanner;

public class Soal58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highestScore = 0;
        String highestScoreName = "";
        int numberOfStudents = 0;

        while (numberOfStudents < 1) {
            System.out.print("Enter the number of students: ");
            numberOfStudents = input.nextInt();

            if (numberOfStudents < 1) {
                System.out.println("Please enter at least 1 for the number of students!\n");
            }
        }

        int count = 1;
        while (count <= numberOfStudents) {
            System.out.print("Student " + count + "'s name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print(name + "'s score: ");
            int score = input.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }

            count++;
        }

        System.out.println("\nStudent with the highest score is " + highestScoreName.toUpperCase());
    }
}
