package workbook;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberGame {
    public static void main(String[] args) {

        boolean finish = false;

        while (!finish) {
            // game here
            // App selects a random number
            int app_random_number = new Random().nextInt(4);

            System.out.print("Guess a number [0-3]: ");
            Scanner scanner = new Scanner(System.in);
            int myGuess = scanner.nextInt();

            //todo assert if input is a number, and a number in a selected scope (10), if not, repeat again

            // Assert if correct
            if (app_random_number == myGuess) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }

            System.out.println("Would you like to play again? [Y/N]");
            Scanner quit = new Scanner(System.in);
            String quitAnswer = quit.nextLine().substring(0).toLowerCase();

            //todo assert if input is Y/N - if not, repeat the question
            finish = !quitAnswer.equals("y");
        }

    }

}
