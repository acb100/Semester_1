import java.util.Scanner;

public class AskUntilQuit {
    public static void main(String[] args) {
        String word = "quit";
        String answer;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter the word \"quit\": ");
            answer = in.nextLine();
            if (answer.equals(word)) {
                break;
            }
            System.out.println("You typed " + answer + ".");
        } while (!(in.equals(word)));
    }
}
