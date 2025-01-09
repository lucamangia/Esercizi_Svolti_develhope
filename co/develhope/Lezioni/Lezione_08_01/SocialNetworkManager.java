package co.develhope.Lezioni.Lezione_08_01;

import java.util.HashMap;

public class SocialNetworkManager {
    private HashMap<String, User> userHashMap;

    public SocialNetworkManager() {
        this.userHashMap = new HashMap<>();
    }

    public void addUser(String name){
        userHashMap.put(name,new User(name));
    }

    public void addUser(User user){
        userHashMap.put(user.getName(),user);
    }

    public void addFriendship(User user1,User user2){
        user1.addFriend(user2);
    }

    public void friendsIncommon(String name1,String name2){
        User user = userHashMap.get(name1);
        User user2 = userHashMap.get(name2);
        if (user.fiendsIncommon(user2)){
            System.out.println("I due utenti hanno un amico in comune");
            return;
        }
        System.out.println("Non hanno un amico in comune");
    }

    public void friendList (String name){
        User user = userHashMap.get(name);
        user.printFriendList();
    }
    /*addFriendship(String name1, String name2) {
        User user1 = users.get(name1);
        User user2 = users.get(name2);*/


}
