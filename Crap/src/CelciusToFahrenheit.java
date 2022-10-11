import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        double celcius;
        double fahrenheit = 32;
        Scanner in = new Scanner(System.in);

        // GET VALUE
        System.out.println("How many celcius do you want to convert? ");
        celcius = in.nextDouble();

        // PRINTS THE VALUE
        double cToF = (celcius*9/5+fahrenheit);
        System.out.println(celcius + " C" + " = " + cToF + " F.");
    }
}
