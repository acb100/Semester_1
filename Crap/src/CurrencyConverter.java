import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double dkk = 1;
        double euro = 0.13;
        double dollar = 0.14;
        int currency;
        double dkkToEuro = (dkk*euro);
        double dkkToDollar = (dkk * dollar);
        Scanner in = new Scanner(System.in);

        // Get Value
        System.out.println("Which currency do you want to convert? ");
        currency = in.nextInt();
        if (currency == 1) {
            System.out.println("How much do you want to convert? ");
            dkkToEuro = in.nextDouble();

        }

    }
}
