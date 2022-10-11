import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int INCH_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        // GET VALUE
        System.out.println("How many cm? ");
        cm = in.nextDouble();

        // CONVERT VARIABLES
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / INCH_PER_FOOT;
        remainder = inches % INCH_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
    }
}
