package MyDie;

import java.util.Random;

public class MyDie {
    private int value;

    public int getValue(){
        return value;
    }

    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(6)+1;
    }

    public MyDie(){
        roll();
    }

}
