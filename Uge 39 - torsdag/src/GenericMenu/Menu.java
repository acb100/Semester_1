package GenericMenu;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    private String menuHeader;
    private String leadText;
    private String menuItems;

    public Menu() {
        setMenuHeader();
        setLeadText();
        setMenuItems();
    }

    public void setMenuHeader() {
        System.out.println("MENU:");
        this.menuHeader = menuHeader;
    }

    public void setLeadText() {
        System.out.println("1. Choose ONE." + "\n2. Choose TWO." + "\n3. Choose THREE." + "\n9. QUIT.");
        this.leadText = leadText;
    }

    public void setMenuItems() {
        this.menuItems = menuItems;
    }

    public String getMenuHeader(String menuHeader) {
        return menuHeader;
    }

    public String getLeadText(String leadText) {
        return leadText;
    }

    public String getMenuItems(String menuItems) {
        return menuItems;
    }

    public void printMenu() {
        getMenuHeader(menuHeader);
        getLeadText(leadText);
        getMenuItems(menuItems);
    }

    public int readChoice() {
        int input = 0;
        boolean loop = true;

        do {
            System.out.println("Please choose:");
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                loop = false;
            } else {
                System.out.println("Invalid input, type a number.\n");
            }
        } while (loop);

        return input;
    }
}