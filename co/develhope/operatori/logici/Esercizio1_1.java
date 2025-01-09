package co.develhope.operatori.logici;

import java.util.Scanner;

public class Esercizio1_1 {
    public static void verficaIntervallo (int limiteSuperiore,int limiteInferiore,int valoreConfronto) {


        if (valoreConfronto >= limiteInferiore && valoreConfronto <= limiteSuperiore) {
            System.out.println("Il valore di confronto è compreso tra " + limiteInferiore + " e " + limiteSuperiore);
        } else {
            System.out.println("Il valore non è compreso tra i due limiti");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire un limite inferiore");
        int limiteInferiore = scan.nextInt();
        System.out.println("Inserire un limite superiore");
        int limiteSuperiore = scan.nextInt();
        System.out.println("Inserire un valore di confronto");
        int valoreConfronto = scan.nextInt();
        scan.close();

        verficaIntervallo(limiteInferiore,limiteSuperiore,valoreConfronto);

    }
}
