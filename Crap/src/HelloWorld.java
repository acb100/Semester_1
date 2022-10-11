import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // exercise 3
        Person p3 = new Person();
        System.out.println(p3.toString());
        Person p4 = new Person("Anders", "Cramer");
        System.out.println(p4.toString());

        for (int i = 0; i < 5; i++) {
            Person pp = new Person("Fornavn: " + i, "Efternavn " + i);
            System.out.println(pp);
            System.out.println(i);
        }
        /* exercise 2
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first name: ");
        String firstname = scanner.nextLine();
        System.out.println("Input your last name: ");
        String lastname = scanner.nextLine();
        System.out.println("Hello " + firstname + " " + lastname);

        exercise 1
        Person p1 = new Person();               // creates a Person object called p1
        p1.setFirstName("Jennifer");            // sets firstName of p1
        System.out.println(p1.getFirstName());  // gets and shows firstName of p1
        Person p2 = new Person();
        p2.setFirstName("Michael");
        System.out.println(p2.getFirstName()); */
    }
}