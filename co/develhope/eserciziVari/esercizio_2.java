package co.develhope.eserciziVari;

public class esercizio_2 {
    public static void main(String[] args) {

        //Obiettivo: Scrivere una funzione che inverta gli elementi di un array di interi.
        //Descrizione: Data una variabile int[] array contenente degli interi, scrivi una funzione che inverta gli elementi dell'array senza usare un array ausiliario.
        // La funzione deve modificare l'array originale.
        //int[] array = {1, 2, 3, 4, 5};

        int [] arr = {1,2,3,4,5};
        int primoNumero = arr[0];

        for (int i = 0; i < arr.length/2;i++){
            arr[i]=primoNumero;
            primoNumero=arr[4];

            System.out.println(arr[i]);


        }









    }
}
