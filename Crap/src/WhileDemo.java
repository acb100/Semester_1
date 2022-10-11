import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        int number = -1;
        Scanner in = new Scanner(System.in);

        while (number != 0) {
            System.out.println("Type a number: ");
            number = in.nextInt();
        }
    }
}
