package co.develhope.Lezioni.Lezione_27_11;

public class Main {
    public static void main(String[] args) {


    /*Crea una classe astratta chiamata Veicolo che abbia:
      Un campo targa (tipo String).
      Un costruttore per inizializzare la targa.
      Un metodo concreto mostraDettagli() che stampa la targa.
      Un metodo astratto muoviti().
      Crea due sottoclassi concrete:
      Auto (implementa muoviti stampando "L'auto si muove su strada.").
      Barca (implementa muoviti stampando "La barca si muove sull'acqua.").
      Nel metodo main:
      Crea un oggetto di tipo Auto e uno di tipo Barca.
      Usa il metodo mostraDettagli() e muoviti() su entrambi.*/


     /*   Auto auto1 = new Auto("xnqsjxqw");
        Barca barca = new Barca("sdjeid");

        auto1.mostraDettagli();
        auto1.muoviti();
        barca.mostraDettagli();
        barca.muoviti();*/

        /*Gerarchia di classi
        Creare una gerarchia di classi per animali. La classe Animale ha un campo
        protected per il nome dell'animale e un metodo protected per ottenere il verso dell'animale.
        Requisiti:
        La classe Animale deve avere un campo protected e un metodo protected.
        Le sottoclassi (Cane e Gatto) devono accedere al campo e al metodo protected.
        Creare una classe Main per testare il comportamento. */

        /*Uso combinato di final e protected
          Creare una classe Libro che contiene:
          Un campo protected chiamato titolo.
          Un metodo final chiamato descrizione che stampa il titolo del libro.
          Una sottoclasse Romanzo che aggiunge un campo autore.
          La sottoclasse non può sovrascrivere il metodo descrizione.*/



        /*Romanzo ad = new Romanzo("pippo","baudo");

        System.out.println(ad.autore);
        System.out.println(ad.titolo);*/


        /*Creare un sistema di gestione per utenti con una classe astratta Utente e due sottoclassi
        (Amministratore e Cliente). La classe deve utilizzare static, final, protected, e classi astratte.
         La classe astratta Utente:
        Ha un campo static per contare il numero totale di utenti creati.
        Ha un campo protected chiamato nome.
        Include un metodo final chiamato getInformazioniGenerali per stampare informazioni comuni.
        Definisce un metodo astratto azioniSpecifiche().
        La classe Amministratore:
        Sovrascrive il metodo azioniSpecifiche.
        Può accedere al nome protetto.
        La classe Cliente:
        Sovrascrive il metodo azioniSpecifiche.
        La classe Main:
        Crea istanze di Amministratore e Cliente.
        Stampa il numero totale di utenti creati.*/

        /*Creare una classe astratta Dispositivo con un metodo astratto accendi che accende il dispositivo
        Creare una classe Lampada che estende la classe Dispositivo e implementa il metodo accendi per accendere la lampada
        Creare una classe astratta Prodotto con un metodo astratto calcolaPrezzo che restituisce il prezzo del prodotto
        Creare una classe Libro che estende la classe Prodotto e implementa il metodo calcolaPrezzo per calcolare il prezzo del libro*/







    }
}
