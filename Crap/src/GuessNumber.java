import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean notGuessed = true;

        int secretNumber = random.nextInt(10) + 1;
        System.out.println("SECRET NUMBER: " + secretNumber);

        while (notGuessed) {
            System.out.println("Guess the number: ");
            int guess = in.nextInt();
            if (guess == secretNumber) {
                System.out.println("Congrats!");
                notGuessed = false;
            } else if (guess > secretNumber) {
                System.out.println("Wrong! The number is too high.");
            } else if (guess < secretNumber) {
                System.out.println("Wrong! The number is too low.");
            }
        }
    }
}
