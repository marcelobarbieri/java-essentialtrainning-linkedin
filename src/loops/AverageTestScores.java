package loops;

/*
 * Nested Loops
 * Find the average of each student´s test scores
 */

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        // Initialize what we know
        int numberOfStudents = 2;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        // Process all students
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("Student #" + (i+1));

            double total = 0;

            // Process a student´s test scores
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total / numberOfTests;
            System.out.println("The test average for student #" + (i+1) +" is " + average);
        }

        scanner.close();
    }
}
