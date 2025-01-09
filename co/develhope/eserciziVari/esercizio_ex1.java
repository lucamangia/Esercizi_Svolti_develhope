package co.develhope.eserciziVari;

import java.util.Scanner;

public class esercizio_ex1 extends RangeCheck{

    //Scrivere una funzione che controlli se un numero int è in un determinato range.
    // Se lo, è ritorna true ; se non lo è, lancia un'eccezione.
    public void main(String[] args) {


        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Inserisci gli estremi del range: ");
            int minInserito = scan.nextInt();
            int maxInserito = scan.nextByte();
            System.out.println("Il range è: " + minInserito + "-" + maxInserito);
            System.out.println("Inserisci un numero generico ");
            int numeroInserito = scan.nextInt();

            boolean risultato = isNumberInRange(numeroInserito,minInserito,maxInserito);
            System.out.println("Il numero è nel range");

        }catch (IllegalArgumentException e){
            System.out.println("Il numero è fuori da range " + e);
        }
    }





































}





