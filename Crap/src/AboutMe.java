import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        // VARIABLES
        String name;
        int birthYear;
        double weight;
        double height;
        boolean hasDriversLicense;
        char gender;
        Scanner in = new Scanner(System.in);

        // INPUT
        System.out.print("Input your name: ");
        name = in.nextLine();
        System.out.print("Input your year of birth: ");
        birthYear = in.nextInt();
        System.out.print("Input your weight (kg): ");
        weight = in.nextDouble();
        System.out.print("Input your height (Enter in meters): ");
        height = in.nextDouble();
        System.out.print("Do you have a drivers license? (true/false) ");
        hasDriversLicense = in.nextBoolean();
        in.nextLine(); // The Scanner Bug
        System.out.print("What is your gender? ");
        gender = in.nextLine().charAt(0);

        double bmi = weight / (height * height);

        // OUTPUT
        System.out.println("\nName: " + name);
        System.out.println("Birth year: " + birthYear);
        System.out.print("BMI: ");
        System.out.printf("%.2f", bmi);
        System.out.println("\nDrivers license: " + hasDriversLicense);
        System.out.println("Gender: " + gender);
    }
}
