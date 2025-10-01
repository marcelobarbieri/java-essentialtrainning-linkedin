package loops;

/*
 * Break Statement
 * Search a string to determine if it contains the letter A
 */

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        // Get text
        System.out.print("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // Search text for letter A
        for (int i = 0;  i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if ( (currentLetter == 'A') || (currentLetter == 'a') ) {
                letterFound = true;
                break;
            }
        }
    }
}
