package co.develhope.Lezioni.Lezione_03_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    /*Scrivi un programma che esegua le seguenti operazioni:
      Crei un array di numeri interi con 5 elementi.
      Richieda all'utente di inserire un indice.
      Stampi il valore dell'array corrispondente a quell'indice.
      Gestisci l'eccezione se l'utente inserisce un indice fuori dai limiti dell'array.
      Scrivi un programma che esegua una semplice calcolatrice:

      Chieda all'utente di scegliere un'operazione (+, -, *, /).
      Chieda due numeri.
      Calcoli il risultato dell'operazione scelta.
      Gestisci eventuali eccezioni che possono verificarsi (come input non valido o divisione per zero).*/

        /*Scrivi un programma che:

      Crea un array di dimensione 10.
      Chiede all'utente di inserire 10 numeri (usa un ciclo for).
      Chiede all'utente di inserire un indice per visualizzare il valore dell'array.
      Gestisce l'errore ArrayIndexOutOfBoundsException nel caso l'indice inserito sia maggiore o uguale a 10.*/


        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("inserire un numero all'indice " + i);
            int numeroDaInserire = scanner.nextInt();
            numbers[i] = numeroDaInserire;
        }

        System.out.println("inserire un indice per visualizzare il valore dell'array");
        int valoraDaVisualizzare = scanner.nextInt();

        /*Problema: Scrivere un programma che verifichi se un numero intero è primo.*/


        System.out.println("inserire un numero");
        int numeroInserito = scanner.nextInt();

       /*Algoritmo di base:
         Se il numero è minore o uguale a 1, non è primo.
         Se il numero è 2, è primo (poiché 2 è l'unico numero primo pari).
         Per tutti gli altri numeri, verifica se esiste un divisore tra 2 e
          radice quadrata del numero. Se esiste un divisore, il numero non è primo. Altrimenti, è primo.
        */

          /*Trova il Massimo Comune Divisore (MCD)
           Problema: Scrivere un programma che calcoli il massimo comune divisore (MCD) di due numeri interi.
           Il Massimo Comune Divisore (MCD) di due numeri è il numero più grande che divide entrambi senza lasciare resto.
           In altre parole, è il maggiore dei divisori comuni tra due numeri.*/


        System.out.println("inserire un numero");
        int a = scanner.nextInt();
        System.out.println("inserire un numero");
        int b = scanner.nextInt();
    }

        public static int MCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }





    }









