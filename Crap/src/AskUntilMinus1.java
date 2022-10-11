import java.util.Scanner;

public class AskUntilMinus1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Type a number: ");
            number = in.nextInt();
        } while (number != -1);
    }
}
