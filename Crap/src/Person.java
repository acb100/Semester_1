import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        // Input
        System.out.print("Whats your first name? \n");
        Scanner sc = new Scanner(System.in);

        // Variables
        String fName = sc.nextLine();

        // fName output
        System.out.println("Is your first name: " + fName + "?" + " " + "\nWhat is your last name?");

        //Variables
        String lName = sc.nextLine();

        // lName output
        System.out.println("So your full name is: " + fName + " " + lName + "?");

    }
}
