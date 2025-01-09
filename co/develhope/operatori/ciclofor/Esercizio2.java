package co.develhope.operatori.ciclofor;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        //Scrivi un programma che contenga un metodo che prende in ingresso un numero
        // e il massimo numero di risultati che vuoi avere e stampi tutti i numeri
        // naturali in ordine inverso (quindi se passo il punto di partenza a 6 e gli
        // dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).

        System.out.print("Inserire numero limite: ");
        Scanner scan            =  new Scanner(System.in);
        int numeroInserito      = scan.nextInt();
        System.out.print("Inserire il numero dei risultati che si vogliono ottenere: ");
        int risultatiDaStampare = scan.nextInt();
        scan.close();

        for (int i = numeroInserito; i > numeroInserito - risultatiDaStampare; i--) {
            System.out.print(i + " ");
        }
    }
}