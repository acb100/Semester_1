import java.util.Scanner;

public class SingleIfStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your number");
        int x = in.nextInt();

        if (x > 0 && x < 10) {
            System.out.println("positive single digit number.");
        } else {
            System.out.println("negative single digit number.");
        }
    }
}