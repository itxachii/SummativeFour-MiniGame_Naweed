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
            


        }
    }

}
