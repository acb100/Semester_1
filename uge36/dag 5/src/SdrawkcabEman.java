import java.util.Scanner;

public class SdrawkcabEman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String nameBackwards = "";

        //Ask about name
        do {
            System.out.print("Please enter your name: ");
            name = sc.nextLine();
        }
        while (name.equals(""));

        //Reverse name
        for (int i = name.length() - 1; i >= 0; i--) {
            nameBackwards += name.toUpperCase().charAt(i);
        }

        //Print reversed name
        System.out.println("Pleased to meet you, " + nameBackwards + ", are you ready to drink beer?");
    }
}
