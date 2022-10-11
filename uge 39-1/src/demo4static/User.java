package demo4static;

public class User {
    private static int nextId = 0;
    private int id;
    private String name;

    public User(String name) {
        this.name = name;
        id = nextId++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
