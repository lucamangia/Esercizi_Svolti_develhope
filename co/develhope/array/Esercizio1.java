package co.develhope.array;

public class Esercizio1 {
    public static int [] createAndFillArray () {

        /* Scrivi un programma che contenga un metodo che crea un array
        e lo riempie con i numeri da 1 a 10 e che che calcoli la somma dei numeri contenuti nell'array inizializzato e
         la stampi a video. */

        int[] array = new int[10];

        for ( int i = 0; i < array.length; i++){
            array[i] = i + 1;

        }
        return array;

    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;

    }
}