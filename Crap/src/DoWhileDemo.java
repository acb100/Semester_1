import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        int number = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Type a number: ");
            number = in.nextInt();
        } while (number != 0);
    }
}
