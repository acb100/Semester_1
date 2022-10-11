import java.util.Random;
import java.util.Scanner;

public class LineBattle {
    Random die = new Random();
    Scanner sc = new Scanner(System.in);
    // POSITION
    int playerPosition;
    int computerPosition;
    // SOLDIERS
    int playerSoldiers = 25;
    int computerSoldiers = 25;
    // BOMB
    boolean playerHasBomb = true;
    boolean playerBombActive = false;
    boolean compHasBomb = true;
    boolean compBombActive = false;
    int playerBombPos;
    int compBombPos;
    // FIREPOWER
    int playerFirepower = 2500;
    int computerFirepower = 2500;
    // DICE
    int computerDiceThrow;
    int playerDiceThrow;
    // ACTION
    char playerAction;
    char computerAction;
    void playerThrow() {
        playerDiceThrow = die.nextInt(6) + 1;
    }
    void computerThrow() {
        computerDiceThrow = die.nextInt(6) + 1;
    }
    // Stats
    void stats() {
        System.out.printf("Computer firepower: %d", computerFirepower);
        System.out.printf("\nPlayer firepower: %d", playerFirepower);
        System.out.printf("\nComputer position: %d.", computerPosition);
        System.out.printf("\nPlayer Position: %d.", playerPosition);
        System.out.printf("\nComputer soldiers: %d", computerSoldiers);
        System.out.printf("\nPlayer soldiers: %d\n", playerSoldiers);
    }
    int distanceBetweenPlayerComputer() {
        int difference = Math.abs(playerPosition - computerPosition);
        return difference;
    }
    int distanceBetweenPlayerPlayerBomb(){
        int difference = Math.abs(playerPosition - playerBombPos);
        return difference;
    }
    int distanceBetweenPlayerComputerBomb() {
        int difference = Math.abs(playerBombPos - compBombPos);
        return difference;
    }
    void scout() {
        if (distanceBetweenPlayerComputer() < 4 && playerPosition < computerPosition) {
            System.out.printf(Colors.ConsoleColors.RED_BACKGROUND + "SCOUT: %d" + Colors.ConsoleColors.RESET + "\n"
                    , computerPosition);
        } else if (distanceBetweenPlayerComputer() < 3 && playerPosition > computerPosition) {
            System.out.printf(Colors.ConsoleColors.RED_BACKGROUND + "SCOUT: %d" + Colors.ConsoleColors.RESET + "\n"
                    , computerPosition);
        }
    }

    // ATTACK
    void playerAttack() {
        playerPosition += playerDiceThrow;
        if (playerPosition == computerPosition) {
            playerThrow();
            int playerFirepowerUse = playerDiceThrow * 100;
            playerFirepower -= playerFirepowerUse;
            System.out.printf("You HIT! You rolled a %d and will therefore use %d firepower, you are the on the same " +
                            "square, meaning you hit %d of your enemies.%n",
                    playerDiceThrow, playerFirepowerUse, playerDiceThrow);
            computerSoldiers -= playerDiceThrow;
            if (computerSoldiers == 0) {
                System.out.println("You won the game!");
            }
            computerSoldiers -= 6 - distanceBetweenPlayerComputer();
            System.out.println("Enemy soldiers remaining: " + computerSoldiers);
        } else if (playerPosition == computerPosition + 1 || playerPosition == computerPosition + 1) {
            playerThrow();
            int playerFirepowerUse = playerDiceThrow * 100;
            System.out.printf("You HIT! You rolled a %d and will therefore use %d firepower, " +
                            "you're more than one square away from your opponent, " + "meaning you hit %d of your enemies.%n",
                    playerDiceThrow, playerFirepowerUse, playerDiceThrow - 1);
        } else {
            System.out.println("You missed. Try again later!");
        }
    }
    void computerAttack() {
        computerPosition += computerDiceThrow;
        if (playerPosition == computerPosition) {
            computerThrow();
            int computerFirepowerUse = computerDiceThrow * 100;
            computerFirepower -= computerFirepowerUse;
            System.out.printf("Computer HITS! Computer rolled a %d and will therefore use %d firepower, " +
                            "computer is the on the same " + "square, meaning computer hit %d of your soldiers.%n",
                    computerDiceThrow, computerFirepowerUse, computerDiceThrow);
            playerSoldiers -= computerDiceThrow;
            if (playerSoldiers == 0) {
                System.out.println("Computer won the game!");
            }
            playerSoldiers -= 6 - distanceBetweenPlayerComputer();
            System.out.println("Your soldiers remaining: " + playerSoldiers);
        } else if (computerPosition == playerPosition + 1 || computerPosition == playerPosition + 1) {
            computerThrow();
            int computerFirepowerUse = computerDiceThrow * 100;
            System.out.printf("Computer HIT! Computer rolled a %d and will therefore use %d firepower, " +
                            "computer is more than one square away from you, " + "meaning computer hit %d of your soldiers.%n",
                    computerDiceThrow, computerFirepowerUse, computerDiceThrow - 1);
        } else {
            System.out.println("Computer just tried to attack, but missed!");
        }
    }
    // BOMB
    void playerPlantBomb() {
        playerBombPos = playerPosition;
        playerHasBomb = false;
        playerBombActive = true;
        System.out.println("You just planted the bomb!");
    }
    void compPlantBomb() {
        compBombPos = playerPosition;
        compHasBomb = false;
        compBombActive = true;
        System.out.println("Computer just planted the bomb!");
    }
    // ACTIONS
    void playerAction() {
        playerThrow();
        if (playerDiceThrow % 2 == 0) {
            playerDiceThrow = 2;
        } else {
            playerDiceThrow = 1;
        }
        switch (playerAction) {
            case 'f':
                playerPosition -= playerDiceThrow;
                if (playerPosition < -10) {
                    playerPosition = -10;
                }
                System.out.printf("You just moved forward to %d\n", playerPosition);
                break;
            case 'r':
                playerPosition += playerDiceThrow;
                if (playerPosition > 10) {
                    playerPosition = 10;
                } else if (playerPosition > 0) {
                    playerFirepower += 250;
                    System.out.println("You just gained 250 firepower, you now have: " + playerFirepower + " firepower");
                }
                System.out.printf("You just retreated to %d\n", playerPosition);

                break;
            case 'a':
                playerThrow();
                playerAttack();
                break;
            case 'b':
                if (playerPosition > 0) {
                    System.out.println("Sorry, you can't plant the bomb here!");
                } else {
                    System.out.println("You planted to bomb, get to the CHOPPER!");
                    playerPlantBomb();
                }
                break;
            case 'd':
                playerBombActive = false;
                System.out.println("You chose to detonate the bomb!");
                if (playerBombPos == -10) {
                    System.out.println("You won the game! GGWP!");
                    System.exit(0);
                } else if (distanceBetweenPlayerComputerBomb() < 6) {
                    computerSoldiers -= 6 - distanceBetweenPlayerComputerBomb();
                    System.out.printf("You just killed %d soldiers.\n", 6 - distanceBetweenPlayerComputerBomb());
                } else {
                    System.out.println("Bomb is too far away to hit enemies, good try though!\n");
                }
                break;
            case 's':
                stats();
                break;
            case 'q':
                System.out.println("Computer wins! You just surrendered.");
                System.exit(0);
            default:
                break;
        }
    }
    void computerAction() {
        String computerOption = "fra";
        computerAction = computerOption.charAt(die.nextInt(3));
        if (computerPosition > 0) {
            computerOption = "frap";
            computerAction = computerOption.charAt(die.nextInt(4));
            computerThrow();
        }

        switch (computerAction) {
            case 'f':
                System.out.println("Computer just moved forward");
                computerPosition += computerDiceThrow;
                if (computerPosition > 10) {
                    computerPosition = 10;
                }
                break;
            case 'r':
                System.out.println("Computer just retreated");
                computerPosition -= computerDiceThrow;
                if (computerPosition < -10) {
                    computerPosition = -10;
                } else if (computerPosition < 0) {
                    computerFirepower += 250;
                }
                break;
            case 'a':
                computerAttack();
                break;
            case 'b':
                compPlantBomb();
                break;
            case 'd':
                System.out.println("Computer chose to detonate the bomb!");
                if (compBombPos == 10) {
                    System.out.println("Computer won the game!");
                    System.exit(0);
                } else if (distanceBetweenPlayerComputerBomb() < 6) {
                    playerSoldiers -= 6 - distanceBetweenPlayerComputerBomb();
                    System.out.printf("Computer just killed %d soldiers.", 6 - distanceBetweenPlayerComputerBomb());
                } else {
                    System.out.println("Bomb is too far away to hit player, good try though!");
                }
        }
    }
    char chooseAction() {
        System.out.println("\nPress a button to choose an action:");
        System.out.println("\nf - move forward" + "\nr - retreat" + "\na - attack" +
                (playerPosition < 0 && playerHasBomb == true ? "\nb - plant bomb" : " ") +
                (playerBombActive == true && distanceBetweenPlayerPlayerBomb()
                > 6 && playerPosition > 0 ? "\nd - detonate bomb" : "") +
                "\ns - stats" + "\nq - surrender");
        playerAction = sc.next().toLowerCase().charAt(0);
        return playerAction;
    }
    void moveToBoard() {
        System.out.println(Colors.ConsoleColors.BLACK_BACKGROUND +
                "Welcome to Line Battle, player and computer will now move to the board." + Colors.ConsoleColors.RESET);
        playerPosition = 11 - playerDiceThrow;
        computerPosition = -11 + computerDiceThrow;
    }
    // GAME ENGINE
    void runGameWhile() {
        while (computerSoldiers > 0 && playerSoldiers > 0) {
            chooseAction();
            playerAction();
            computerAction();
            scout();
        }
    }
    void run() {
        moveToBoard();
        runGameWhile();
        System.out.println(playerDiceThrow);
    }
    public static void main(String[] args) {
        new LineBattle().run();
    }
}