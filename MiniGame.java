import java.util.Scanner;

public class MiniGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secretNumber = (int) (Math.random() *100) + 1;
        int[][] guessHistory = new int[10][2];
        int numGuesses = 0;

        System.out.println("Welcome to the Guess the Number Game!");

        while (numGuesses < 10) {
            System.out.println("Enter your Guess (1-100): ");
            int guess = in.nextInt();

        }

    }
}
