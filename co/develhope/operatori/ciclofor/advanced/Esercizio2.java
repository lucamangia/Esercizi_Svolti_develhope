package co.develhope.operatori.ciclofor.advanced;

import java.util.Scanner;

public class Esercizio2 {

    /*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
     stampa tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5. */


    public static void stampa(int numeroInserito){

            for(int i = 0; i <= numeroInserito; i++){
                if (i==5){
                    continue;
                }
                System.out.print(i + " ");
            }
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Inserire un numero:");
            int numeroInserito = scan.nextInt();
            scan.close();
            stampa(numeroInserito);
        }
    }


