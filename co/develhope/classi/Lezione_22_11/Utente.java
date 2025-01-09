package co.develhope.classi.Lezione_22_11;

public class Utente {

    private static int numeroUtenti = 1;
    private static final int max_Utenti = 2;

    public Utente (){
        if (numeroUtenti <= max_Utenti){
            this.numeroUtenti++;
            System.out.println("Nuovo utente creato");
        }else {
            System.out.println("Numero di utenti massimo raggiunto");
        }
    }
}
