package demo2constructors;

public class Cat {
    String name;
    boolean hasChip = false;

    public Cat(String name) {
        setName(name);
    }

    public Cat(String name, boolean hasChip) {
        setName(name);
        this.hasChip = hasChip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
