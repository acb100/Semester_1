import java.util.Random;
import java.util.Scanner;

public class DiceGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.printf("Is the number even or odd? ");
        String userGuess = sc.nextLine();

        int diceThrow = rand.nextInt(6) + 1;
        System.out.println(diceThrow);

        if (userGuess.equals("odd") && diceThrow == 1 || diceThrow == 3 || diceThrow == 5) {
            System.out.println("Correct!");
        } else if (userGuess.equals("even") && diceThrow == 1 || diceThrow == 3 || diceThrow == 5) {
            System.out.println("Wrong answer!");
        }
        if (userGuess.equals("odd") && diceThrow == 2 || diceThrow == 4 || diceThrow == 6) {
            System.out.println("Correct!");
        } else if (userGuess.equals("even") && diceThrow == 2 || diceThrow == 4 || diceThrow == 6) {
            System.out.println("Wrong answer!");
        }
    }
}