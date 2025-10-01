package decision_structures;

import java.util.Scanner;

/**
 * Switch Expression
 * Have a user enter their letter grade, and using a switch statement
 * print out a message letting them know how they did.
 */

public class SwitchExpression {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D","E" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        // There isn´t fall through

        /* Multiple Statement in Switch Expression
         * float firstNumber = 2;
         * float secondNumber = 8;
         * float result = switch(operation) {
         *      case "+" -> {
         *          System.out.println("Adding...");
         *          yield firstNumber + secondNumber;
         *      }
         *      case "-" -> {
         *          System.out.println("Subtracting...");
         *          yield firstNumber - secondNumber;
         *      }
         *      default -> 0;
         * }
         */
    }
}
