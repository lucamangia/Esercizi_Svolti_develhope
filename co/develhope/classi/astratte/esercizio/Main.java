package co.develhope.classi.astratte.esercizio;

public class Main {
    /*Scrivere un programma che contenga una classe astratta chiamata
     Forma ed un metodo astratto chiamato calcolaArea().
      Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma
      ed implementano il metodo per il calcolo dell'area in maniera specifica.
     */
    public static void main(String[] args) {

        Triangolo triangolo = new Triangolo(22,15);
        System.out.println(triangolo.calcolaArea());
        Rettangolo rettangolo = new Rettangolo(15,17);
        System.out.println(rettangolo.calcolaArea());

    }
}
