package Task2;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("Try to guess the number between 1 and 100;");

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + "guess(es) left. Choose your number: ");
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess);
            } else if (randomNumber > guess) {
                System.out.println("It's bigger than " + guess);
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! YOU WON!");
        } else {
            System.out.println("GAME OVER! You lose! The number was " + randomNumber);
        }
    }
}
