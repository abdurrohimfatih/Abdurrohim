package chapter5.tugas;

import java.util.Scanner;

public class Soal59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highestScore = 0, secondScore = 0;
        String highestName = "", secondName = "";
        int numberOfStudents = 0;

        while (numberOfStudents < 2) {
            System.out.print("Enter the number of students: ");
            numberOfStudents = input.nextInt();

            if (numberOfStudents < 2) {
                System.out.println("Please enter at least 1 for the number of students!\n");
            }
        }

        int count = 0;
        while (count < numberOfStudents) {
            System.out.print("Student " + (count + 1) + "'s name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print(name + "'s score: ");
            int score = input.nextInt();

            if (count == 0) {
                highestScore = score;
                highestName = name;
            }

            else if (count == 1 && score > highestScore) {
                secondScore = highestScore;
                highestScore = score;
                secondName = highestName;
                highestName = name;
            }

            else if (count == 1) {
                secondScore = score;
                secondName = name;
            }

            else if (count > 1 && score > highestScore && score > secondScore) {
                secondScore = highestScore;
                secondName = highestName;
                highestScore = score;
                highestName = name;
            }

            else if (count > 1 && score > secondScore) {
                secondName = name;
                secondScore = score;
            }

            count++;
        }

        System.out.println("\nThe highest score student is " + highestName.toUpperCase());
        System.out.println("The second-highest score student is " + secondName.toUpperCase());
    }
}
