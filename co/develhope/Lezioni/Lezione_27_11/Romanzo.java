package co.develhope.Lezioni.Lezione_27_11;

public class Romanzo extends Libro{

    public String autore;

    public Romanzo(String titolo,String autore) {
        super(titolo);
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
}
