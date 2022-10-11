import java.sql.SQLOutput;
import java.util.Scanner;

public class AthleteStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String athleteName;
        double time;
        double meter;
        double mm;
        double ms;


        System.out.println("Whats your name? ");
        athleteName = in.nextLine();

        System.out.println("Enter number of seconds (with decimals): ");
        time = in.nextDouble();

        System.out.println("Enter number of meters: ");
        meter = in.nextDouble();

        ms = (time - (int)time) * 100;
        mm = (meter - (int)meter) * 1000;


        System.out.println("Name: " + athleteName);
        System.out.println("Time: " + (int)time + " seconds and " + (int)ms + " milliseconds.");
        System.out.println("Distance: " + (int)meter + " meter and " + (int)mm + " millimeter.");
    }
}
