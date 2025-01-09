package co.develhope.classi.Lezione_22_11;

public class Studente {

        /*Crea una classe chiamata Studente che tiene traccia del punteggio medio di tutti gli studenti.
    Usa una variabile static per mantenere la somma dei punteggi e il numero totale di studenti.
    Consegna:
    Aggiungi un campo static per la somma dei punteggi (sommaPunteggi) e uno per il numero di studenti (numeroStudenti).
    Ogni volta che viene creato un oggetto Studente, aggiungi il suo punteggio a sommaPunteggi e incrementa numeroStudenti.
    Crea un metodo statico per calcolare la media dei punteggi.*/

   /* private static int numeroStudenti = 0;
    private static int sommaPunteggi  = 0;
    private int punteggioStudente     = 0;


    public Studente(int punteggio){
        sommaPunteggi += punteggio;
        numeroStudenti++;
        this.punteggioStudente = punteggio;
    }

    public static Double mediaPunteggi(){
        if (numeroStudenti > 0){
            return (double) sommaPunteggi/numeroStudenti;
        }
        return null;
    }*/


}
