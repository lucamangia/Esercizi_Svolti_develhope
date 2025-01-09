package co.develhope.funzioni;

import java.util.Scanner;

public class esercizio_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digitare una stringa");
        String stringaDaInserire = scan.next();
        System.out.println(stringaDaInserire);

        int lunghezzaDellaStringa = 0;
        for (int i = 0; i <stringaDaInserire.length();i++){
            lunghezzaDellaStringa++;
        }
        System.out.println("La lunghezza della stringa è di " + lunghezzaDellaStringa + " caratteri");
    }
}
