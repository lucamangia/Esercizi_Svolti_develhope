package co.develhope.operatori.ciclofor;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        /*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
         e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video. */
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire un numero:");
        int numeroInserito = scan.nextInt();
        int index = 0;
        scan.close();

        for (int i = numeroInserito; i <= numeroInserito * 10; i++){
            if (i % numeroInserito==0){
                index++;
                System.out.println(numeroInserito + " x " + index + " = " + i);
            }
        }
    }
}
