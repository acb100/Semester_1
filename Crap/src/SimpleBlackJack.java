import java.util.Random;
import java.util.Scanner;

public class SimpleBlackJack {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int compCard = rand.nextInt(13) + 1;
        int playerCard = rand.nextInt(13) + 1;

        int playerValue = 0;
        int compValue = 0;
        int compScore = compValue;
        int playerScore = playerValue;
        String cardName = "";

        //Player cards
        switch (playerCard) {
            case 1:
                playerValue = 1;
                cardName = "Ace";
                break;
            case 2:
                playerValue = 2;
                cardName = "Two";
                break;
            case 3:
                playerValue = 3;
                cardName = "Three";
                break;
            case 4:
                playerValue = 4;
                cardName = "Four";
                break;
            case 5:
                playerValue = 5;
                cardName = "Five";
                break;
            case 6:
                playerValue = 6;
                cardName = "Six";
                break;
            case 7:
                playerValue = 7;
                cardName = "Seven";
                break;
            case 8:
                playerValue = 8;
                cardName = "Eight";
                break;
            case 9:
                playerValue = 9;
                cardName = "Nine";
                break;
            case 10:
                playerValue = 10;
                cardName = "Ten";
                break;
            case 11:
                playerValue = 10;
                cardName = "Jack";
                break;
            case 12:
                playerValue = 10;
                cardName = "Queen";
                break;
            case 13:
                playerValue = 10;
                cardName = "King";
                break;

        }

        //Computer cards
        switch (compCard) {
            case 1:
                compValue = 1;
                cardName = "Ace";
                break;
            case 2:
                compValue = 2;
                cardName = "Two";
                break;
            case 3:
                compValue = 3;
                cardName = "Three";
                break;
            case 4:
                compValue = 4;
                cardName = "Four";
                break;
            case 5:
                compValue = 5;
                cardName = "Five";
                break;
            case 6:
                compValue = 6;
                cardName = "Six";
                break;
            case 7:
                compValue = 7;
                cardName = "Seven";
                break;
            case 8:
                compValue = 8;
                cardName = "Eight";
                break;
            case 9:
                compValue = 9;
                cardName = "Nine";
                break;
            case 10:
                compValue = 10;
                cardName = "Ten";
                break;
            case 11:
                compValue = 10;
                cardName = "Jack";
                break;
            case 12:
                compValue = 10;
                cardName = "Queen";
                break;
            case 13:
                compValue = 10;
                cardName = "King";


        }
    }
}
