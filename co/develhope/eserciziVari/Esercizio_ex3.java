package co.develhope.eserciziVari;

import java.util.Scanner;

public class Esercizio_ex3  {

    /*Scrivere una funzione che provi a dividere un numero per 0 e
    catturi l'eccezione leggendone il messaggio.*/

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("inserire un numero");
            int numeroInserito = scan.nextInt();
            System.out.println("Inserire divisore");
            int divisoreInserito = scan.nextInt();

            Divisibile.isDivisibile(numeroInserito,divisoreInserito);

        }catch (ArithmeticException e){
            System.out.println("Divisione per 0 non supportata");
        }

    }




}
