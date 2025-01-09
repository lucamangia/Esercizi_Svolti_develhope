package co.develhope.operatori.assegnazione;

public class Esercizio1 {

    public static int calcolaOperazione(int a, int b, int x) {
        a += x;
        b += x;
        return a * b;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int x = 2;
        int risultato = calcolaOperazione(a, b, x);
        System.out.println(risultato);
    }
}


