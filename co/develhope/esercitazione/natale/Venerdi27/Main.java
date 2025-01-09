package co.develhope.esercitazione.natale.Venerdi27;

import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class Main {
    public static void main(String[] args) {

        /*Scrivi un programma in Java per visualizzare i primi n numeri naturali e la loro somma.
         n è preso in input
         Esempio
         Dati di test
         Inserisci il numero: 2
         Uscita prevista:
         Numero di input: 2
         I primi n numeri naturali sono: 2, 1
         La somma del numero naturale fino a n termini: 1+2 = 3

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers that you wish");
        int input = scan.nextInt();
        scan.close();
        int somma = 0;

        for (int i = 1; i <= input; i++){
            System.out.println(i);
            somma += i;
        }
        System.out.println("somma: " + somma);*/

        /*Scrivi un programma in Java per visualizzare gli n, con n preso in input, numeri dispari e la loro somma.
          Esempio
          Dati di test
          Il numero di input inserito è: 5
          Uscita prevista:
          I numeri dispari sono:
          1
          3
          5
          7
          9
          La somma del numero naturale dispari fino a 5 termini è: 25*/

        System.out.println("Enter the number of odds you wish");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        int counter = 1;
        int somma = 0;
        for(int i = 1; i > 0 ;i++){
            if (i % 2 == 1 && counter <= input){
                counter++;
                System.out.println(i);
                somma += i;
            }
        }
        System.out.println("The sum is: " + somma);


















    }
}
