package co.develhope.Lezioni.Lezione_08_01;

public class Main {
    /*Social Network
Crea un semplice sistema di social network.
Definisci una classe User con:
String name, HashSet<User> friends.
Utilizza un HashMap<String, User> per memorizzare gli utenti.
Scrivi metodi per:
Aggiungere un nuovo utente.
Aggiungere un'amicizia tra due utenti.
Verificare se due utenti hanno amici in comune.
Stampare la lista di amici di un utente.*/
    public static void main(String[] args) {
        User user1 = new User("Giovanni");
        User user2 = new User("Leonardo");
        User user3 = new User("Emanuel");

        SocialNetworkManager manager = new SocialNetworkManager();
        manager.addUser(user1);
        manager.addUser(user2);
        manager.addUser(user3);

        manager.addFriendship(user1,user2);
        manager.addFriendship(user2,user3);

        manager.friendsIncommon("Giovanni","Emanuel");

        manager.friendList("Leonardo");





    }
}
