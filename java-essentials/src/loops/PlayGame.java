package loops;

import java.util.Random;

public class PlayGame {

    public static void main(String[] args) {
        String result = playGame();
        System.out.println(result);
    }

    static String playGame() {

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";

        for (int i = 0; i<= maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace += die;

            if (currentSpace == lastSpace)
                return String.format(justRight, currentSpace);
            else if (currentSpace > lastSpace)
                return String.format(tooHigh, lastSpace);
            else if ((i == maxRolls) && (currentSpace < lastSpace))
                return String.format(tooLow, currentSpace);
        }

        return "";
    }
}
