import java.util.Scanner;

public class SuperMarioClone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize game variables
        int playerPosition = 0;
        int score = 0;
        boolean gameOver = false;
        boolean levelComplete = false;

        // Game loop
        while (!gameOver && !levelComplete) {
            System.out.println("Current position: " + playerPosition);
            System.out.println("Score: " + score);
            System.out.println("Enter your move (left, right, jump):");
            String move = scanner.nextLine();

            // Handle player movement
            if (move.equals("left")) {
                playerPosition--;
            } else if (move.equals("right")) {
                playerPosition++;
            } else if (move.equals("jump")) {
                // Perform jump action
                score += 10;
            }

            // Check for collision with enemy or obstacle
            if (playerPosition == 10) {
                System.out.println("Game Over! You collided with an enemy.");
                gameOver = true;
            }

            // Check for reaching the end of the level
            if (playerPosition >= 20) {
                System.out.println("Congratulations! You completed the level.");
                levelComplete = true;
            }
        }

        scanner.close();
    }
}
