import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month number (1-12): ");
        int monthNumber = in.nextInt();

        switch (monthNumber){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Has 31 days.");
                break;
            case 4, 6, 9, 11:
                System.out.println("Has 30 days.");
                break;
            case 2:
                System.out.println("Input year: ");
                int year = in.nextInt();
                System.out.println((year % 4 == 0 ? "29" : "28") + " days");
                break;
            default:
                System.out.println("There's EXACTLY 12 months in a year, no more, no less!");
        }
    }
}