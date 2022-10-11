import java.util.Random;
import java.util.Scanner;

public class OpgaveCardValueGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Random values
        int randomValue = rand.nextInt(13) + 1;
        int randomSuit = rand.nextInt(4) + 1;

        // Values
        int guess = 0;

        // Guesses
        String suitGuess = "";
        int valueGuess = 0;

        // Number of tries
        int guessCount = 0;
        int guessCountValue = 0;
        int guessLimitSuit = 2;
        int guessLimitValue = 3;
        boolean outOfGuesses = false;

        // Card values
        int value;
        switch (randomValue) {
            case 1:
                value = 1;
                break;
            case 2:
                value = 2;
                break;
            case 3:
                value = 3;
                break;
            case 4:
                value = 4;
                break;
            case 5:
                value = 5;
                break;
            case 6:
                value = 6;
                break;
            case 7:
                value = 7;
                break;
            case 8:
                value = 8;
                break;
            case 9:
                value = 9;
                break;
            case 10:
                value = 10;
                break;
            case 11:
                value = 11;
                break;
            case 12:
                value = 12;
                break;
            case 13:
                value = 13;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randomValue);
        }

        // Card Suit
        String suit = "";
        switch (randomSuit) {
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Clubs";
                break;
            case 3:
                suit = "Hearts";
                break;
            case 4:
                suit = "Spades";
                break;
        }


        // Suit
        while (!suitGuess.equals(suit) && !outOfGuesses) {
            if (guessCount < guessLimitSuit) {
                System.out.println("Guess the suit (Diamonds, Hearts, Spades, Clubs): ");
                suitGuess = sc.nextLine();
                guessCount++;
            } else {
                outOfGuesses = true;
                break;
            }
        }
        if (outOfGuesses) {
            System.out.println("Out of guesses, try again.");

        } else {
            System.out.println("Congratulations, now you need to guess the value!");
        }

        //VALUE
        while (valueGuess != value && !outOfGuesses) {
            if (guessCountValue < guessLimitValue) {
                System.out.println("Value: ");
                valueGuess = sc.nextInt();
                guessCountValue++;
            } else {
                outOfGuesses = true;
            } if (outOfGuesses) {
                    System.out.println("Out of guesses, try again.");
                    break;
            } if (valueGuess == value) {
                System.out.println("Congratulations, you won!");
            } else if (valueGuess > value) {
                System.out.println("You are too high!");
            } else if (valueGuess < value) {
                System.out.println("You are too low!");
            }
        }
    }
}