package co.develhope.Lezioni.Lezione_08_01;

import java.util.HashSet;

public class User {
    private String name;
    private HashSet<User> friends;

    public User(String name){
        this.name = name;
        this.friends = new HashSet<>();
    }

    public User(String name, HashSet<User> friends) {
        this.name = name;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<User> getFriends() {
        return friends;
    }

    public void setFriends(HashSet<User> friends) {
        this.friends = friends;
    }

    public void addFriend(User user){
        friends.add(user);
        user.getFriends().add(this);
    }

    public void printFriendList(){
        for (User user : friends){
            System.out.println(user.getName());
        }
    }
    public boolean fiendsIncommon(User user){
        for (User friend : friends){
            if (user.getFriends().contains(friend)){
                return true;
            }
        }
        return false;
    }
}
