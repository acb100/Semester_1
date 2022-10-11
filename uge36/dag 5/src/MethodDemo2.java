import java.util.Scanner;

public class MethodDemo2 {
    Scanner in = new Scanner(System.in);
    void printNameOfProgram() {
        System.out.println("Hello World 2");
    }

    String receiveName() {
        System.out.print("Enter name: ");
        String name = in.nextLine();
        return name;
    }

    int receiveAge (){
        System.out.print("Enter age: ");
        int age = in.nextInt();
        return age;
    }

    void printGreeting(String name, int age){
        System.out.println("Hello " + name + " at " + age + " years old.");
    }

    void run() {
        printNameOfProgram();
        String name = receiveName();
        int age = receiveAge();
        printGreeting(name, age);
    }

    public static void main(String[] args) {
        new MethodDemo2().run();

    }
}
