package co.develhope.classi.sei;

public class Libro {

    /*Creare una classe Libro con attributi che rappresentano le caratteristiche di un libro
    (titolo, autore, prezzo, numero di pagine). Utilizzare getter e setter per accedere e modificare i dati.

Istruzioni
Crea una classe Libro con i seguenti attributi:
titolo (String)
autore (String)
prezzo (double)
numeroPagine (int)
Aggiungi un costruttore che accetti tutti gli attributi come parametri.

Implementa i metodi getter e setter per ogni attributo.*/

    public Libro(){

    }
    private String titolo;
    private String autore;
    private double prezzo;
    private int numeroDiPagine;

    public Libro(String titolo, String autore, double prezzo, int numeroDiPagine){

        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.numeroDiPagine = numeroDiPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroDiPagine() {
        return numeroDiPagine;
    }

    public void setNumeroDiPagine(int numeroDiPagine) {
        this.numeroDiPagine = numeroDiPagine;
    }
    public String stampaDettagli (){
        return "il titolo è "+this.titolo + " l'autore è " + this.autore + " il prezzo è " + this.prezzo + " le pagine sono " + this.numeroDiPagine;

    }
}
