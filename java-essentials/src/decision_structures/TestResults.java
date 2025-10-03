package decision_structures;

import java.util.Scanner;

/**
 * If-Else-If
 * Display the letter grade for a student based on ther test score
 */

public class TestResults {

    public static void main(String[] args) {

        // Get the test score

        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        // Determine the letter grade

        char grade;

        if (score < 50)
            grade = 'F';
        else if (score < 60)
            grade = 'E';
        else if (score < 70)
            grade = 'D';
        else if (score < 80)
            grade = 'C';
        else if (score < 90)
            grade = 'B';
        else
            grade = 'A';

        System.out.println("Your grade is " + grade);
    }

}
