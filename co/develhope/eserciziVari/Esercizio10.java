package co.develhope.eserciziVari;

import java.lang.runtime.SwitchBootstraps;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Esercizio10 {
    public static void main(String[] args) {
        //Scrivi un programma che riceva in input un mese (numero da 1 a 12)
        // e visualizzi la stagione (inverno, primavera, estate, autunno).
        // Usa switch con gruppi di casi.
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire un numero corrispondente ad un mese");
        int numeroInserito = scan.nextInt();

        String[] mese = {"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno",
                         "Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};

        String[] stagione = {"Inverno", "Primavera", "Estate", "Autunno"};

        String risultato;

        String uno     = "inverno"   ;
        String due     = "primavera" ;
        String tre     = "estate"    ;
        String quattro = "autunno"   ;


        switch (numeroInserito){
                case 1:
                    risultato = mese[11];
                case  2:
                    risultato = mese[0];
                case  3:
                    risultato = mese[1];
                    System.out.println("il mese " + risultato + " appartiene alla stagione " + stagione[0]);
                    break;

                case  4:
                    risultato = mese[2];
                case  5:
                    risultato = mese[3];
                case  6:
                    risultato = mese[4];
                    System.out.println("il mese " + risultato + " appartiene alla stagione " + stagione[1]);
                    break;
                case  7:
                    risultato = mese[5];
                case  8:
                    risultato = mese[6];
                case  9:
                    risultato = mese[7];
                    System.out.println("il mese " + risultato + " appartiene alla stagione " + stagione[2]);
                    break;
                case 10:
                    risultato = mese[8];
                case 11:
                    risultato = mese[9];
                case 12:
                    risultato = mese[10];
                    System.out.println("il mese " + risultato + " appartiene alla stagione " + stagione[3]);
                    break;
                default:
                    System.out.println("il numero inserito non corrisponde a nessun mese");
        }

    }
}

