import java.util.Scanner;

public class DoWhileName {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Type a name: ");
            name = in.nextLine();
        } while (name != name);
    }
}
