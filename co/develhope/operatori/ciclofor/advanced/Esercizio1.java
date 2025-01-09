package co.develhope.operatori.ciclofor.advanced;

import java.util.Scanner;

public class Esercizio1 {

    /*Scrivi un programma che contenga un metodo che prende in
    ingresso un valore numerico e stampa tutti i numeri fino al valore immesso,
     la stampa dovrà interrompersi se il valore è uguale a 5. */


        public static void stampa(int numeroInseirto){

            for(int i = 0; i <=numeroInseirto;i++){
                System.out.print(i);
                System.out.print(" ");
                if (i==5){
                    break;
                }
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


