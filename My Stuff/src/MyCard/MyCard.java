package MyCard;

import java.util.Random;

public class MyCard {
    Random rand = new Random();
    private Color color;
    private int value;

    public MyCard(int value, Color color) {
        setValue(value);
        setColor(color);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}