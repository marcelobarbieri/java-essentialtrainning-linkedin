package methods;

/*
 * Passing Arguments to Methods
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25.000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String[] args) {

        // Get input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();

        scanner.close();

        // Check if the user is qualified

        boolean qualified = isUserQualified(salary,creditScore);
        notifyUser(qualified);
    }

    public static boolean isUserQualified(double salary, int creditScore) {

        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        return (salary >= requiredSalary) && (creditScore >= requiredCreditScore);
    }

    public static void notifyUser(boolean isQualified) {
        String message = isQualified
                ? "Congrats! You´ve been approved!"
                : "Sorry, you´ve been declined.";
        System.out.println(message);
    }

}
