package FriendsWithData;

import java.util.Arrays;
import java.util.Scanner;

public class FriendTest {
    Scanner sc = new Scanner(System.in);
    private Friend[] friends;

    public Friend[] createFriendList(int friendAmount) {
        friends = new Friend[friendAmount];
        return friends;
    }

    public int getFriendAmount() {
        System.out.println("How many friends do you want?");
        int friendAmount = sc.nextInt();
        sc.nextLine();
        return friendAmount;
    }

    public void addFriendsToList(Friend[] friends){
        for (int i = 0; i < friends.length; i++){
            friends[i] = new Friend(getName(), getPhone(), getEmail());
        }
    }

    public String getName() {
        System.out.println("What's your friends name?");
        String name = sc.nextLine();
        return name;
    }

    public String getPhone() {
        System.out.println("What's your friends phone number?");
        String phone = sc.nextLine();
        return phone;
    }

    public String getEmail() {
        System.out.println("What's your friends email?");
        String email = sc.nextLine();
        return email;
    }


    public Friend[] getFriends(){
        return friends;
    }

    public void run() {
        createFriendList(getFriendAmount());
        addFriendsToList(friends);
        System.out.println(Arrays.toString(getFriends()));
    }

    public static void main(String[] args) {
        new FriendTest().run();
    }
}