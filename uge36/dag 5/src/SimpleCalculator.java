import java.util.Scanner;

public class SimpleCalculator {
    Scanner sc = new Scanner(System.in);
    int choice;
    int result;
    int num1;
    int num2;

    void welcomeMessage() {
        System.out.println("Welcome to my simple calculator!");
    }

    int getFirstNumber() {
        System.out.println("Input first number: ");
        int num1 = sc.nextInt();
        return num1;
    }

    int getSecondNumber() {
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        return num2;
    }

    void showMenu() {
        System.out.println("\nWhich operation do you choose? \n\nAddition \nSubtract. \nMultiply. \nDivide. ");
        int choice = sc.nextInt();
    }

    int getSelection() {
        switch (choice) {
            case 1:
                choice = 1;
                break;
            case 2:
                choice = 2;
                break;
            case 3:
                choice = 3;
                break;
            case 4:
                choice = 4;
                break;
            default:
                System.out.println("Illegal operation");
        }
        return choice;
    }

    int doTheMath(int choice, int num1, int num2) {
        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4) {
            result = num1 / num2;
        }
        return result;
    }

    void displayResult() {
        if (choice == 1)
            System.out.println(num1 + " + " + num2 + " = " + (result));
        else if (choice == 2)
            System.out.println(num1 + " - " + num2 + " = " + (result));
        else if (choice == 3)
            System.out.println(num1 + " * " + num2 + " = " + (result));
        else
            System.out.println(num1 + " / " + num2 + " = " + (result));
    }

    void run() {
        welcomeMessage();
        int num1 = getFirstNumber();
        int num2 = getSecondNumber();
        showMenu();
        int choice = getSelection();
        int result = doTheMath((int) choice, (int) num1, (int) num2);
        displayResult();
    }


    public static void main(String[] args) {
        new SimpleCalculator().run();
    }
}
