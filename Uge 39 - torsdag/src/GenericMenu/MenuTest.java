package GenericMenu;

public class MenuTest {

    public void run() {
        Menu menu = new Menu();
        menu.printMenu();

            switch (menu.readChoice()) {
                case 1:
                    System.out.println("You chose ONE.");
                    break;
                case 2:
                    System.out.println("You chose TWO.");
                    break;
                case 3:
                    System.out.println("You chose THREE.");
                    break;
                case 9:
                    System.out.println("You chose QUIT.");
                    break;
                default:
                    menu.printMenu();
                    break;
            }
        }

    public static void main(String[] args) {
        new MenuTest().run();
    }
}