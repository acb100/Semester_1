package demo4static;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User("Kattie");
        User u2 = new User("Karry");
        User u3 = new User("Pottie");

        System.out.println(u1.getId());
        System.out.println(u2.getId());
        System.out.println(u3.getId());
    }
}
