package co.develhope.esercitazione.natale.Recupero1;


import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public void arrayFiller (){
        int [] array = new int[9];
        int numero = 0;
        int somma = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = numero;
            numero++;
            somma = somma + numero;
            if (numero == 10){
                break;
            }
        }
        System.out.println(somma);
    }
    public static void main(String[] args) {

        /*Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e
        che che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.*/




    }
}
