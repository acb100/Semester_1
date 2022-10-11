import java.util.Scanner;

public class MathMethodsInUse {
    public static void main(String[] args) {

        // INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of seconds: ");

        // VARIABLES
        int seconds = input.nextInt();
        int minute = seconds/60;
        int hour = minute/60;
        int days = hour/24;
        int printSeconds = seconds - (minute*60);
        int printMinutes = minute - (hour*60);
        int printHour = hour - days*24;

        // OUTPUT
        System.out.println(seconds + " = "
                + days + " days, "
                + printHour + " hours, "
                + printMinutes + " minutes and "
                + printSeconds + " seconds.");
    }
}
