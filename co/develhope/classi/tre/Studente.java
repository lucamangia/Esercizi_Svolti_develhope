package co.develhope.classi.tre;

public class Studente {

    /*Crea una classe Studente con:
    Attributi: nome, cognome, matricola e mediaVoti.
    Costruttore per inizializzare il nome, il cognome e la matricola. La mediaVoti inizia da 0.
    Metodi:
    aggiornaMedia(double nuovoVoto): Aggiorna la media in base al nuovo voto.
    toString(): Restituisce una rappresentazione testuale dello studente.
    Nel metodo main, crea uno studente, aggiorna la media e stampa i suoi dettagli.*/

    public String nome;
    public String cognome;
    public String matricola;
    public double mediaVoti;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }

    public Studente (){
        this.nome      = nome;
        this.cognome   = cognome;
        this.matricola = matricola;
        this.mediaVoti = mediaVoti;
    }



}
