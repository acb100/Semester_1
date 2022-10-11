package demo3enums;

import java.util.Random;

public class Coin {
    private FaceValue value;

    public Coin() {
        flip();
    }

    public void flip() {
        Random rand = new Random();
        // Ternary operator
        value = rand.nextBoolean() ? FaceValue.HEADS : FaceValue.TAILS;

        // Nedenstående giver det samme
        if (rand.nextBoolean() == true)
            value = FaceValue.HEADS;
        else
            value = FaceValue.TAILS;
    }

    public FaceValue getValue() {
        return value;
    }
}
