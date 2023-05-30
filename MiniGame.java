import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MiniGame {
    public static void main(String[] args) {
        MiniGame game = new MiniGame();
        game.playGame();
    }

    public void playGame() {
        int[] numberSequence = generateNumberSequence();
        int guessCount = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the GuessTheNumber Game!");
        System.out.println("Guess the " + numberSequence.length + " numbers in the sequence.");

        boolean guessedCorrectly = false;
        while (!guessedCoreectly) {
            System.out.println("Enter your guess (seperated by spaces): ");
            String input = in.nextLine();

            String[] guessArray = input.split(" ");

            if (guessArray.length != numberSequence.length) {
                System.out.println("Invalid guess length. Try again.");

            }

            int[] guess = new int[guessArray.length];
            if (!parseGuess(guessArray.length)) {
                System.out.println("Invalid guess format. Try Again. ");
            }

            guessCount++;

            guessedCorrectly = checkGuess(guess, numberSequence);

            if (guessedCorrectly) {
                System.out.println("Congratulations! You guessed correctly in " + guessCount + " attempts.");
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
        }
        in.nextLine();
        System.out.println("Press enter to exit...");
        in.nextLine();

    }

    public int[] generateNumberSequence() {
        Random random = new Random();
        int[] sequence = new int[4];
    }
    for(int i = 0;i<sequence.length;i++)
    {
        sequence[i] = random.nextInt(10);
    }return sequence;
}
