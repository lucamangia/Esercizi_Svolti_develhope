package co.develhope.eserciziVari;

public class Esercizio13 {
    public static void main(String[] args) {

        /*String[] words = {"ciao", "Java", "ok", "for", "fantastico"};

        int count = 0;
        for (String parola : words){
            if (parola.length()>3){
                count++;
            }
        }
        System.out.print(count);*/

       //----------------------------------


       /* int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 6};
        int[] tmpArr = new int[array1.length];
        int count = 0;

        for (int numero : array1){
            boolean found = false;
            for (int numero2 : array2 ){
                if (numero == numero2){
                    found = true;
                    break;
                }
            }
            if ( !found ){
                tmpArr[count] = numero;
                count++;
            }
        }
        for (int i =0; i<tmpArr.length; i++){
            System.out.print(tmpArr[i] + " ");
        }
        System.out.println();
        int [] tmp2Arr = new int[count];

        for (int i = 0; i < count; i++){
            tmp2Arr[i] = tmpArr[i];
        }

        for (int numero : tmp2Arr){
            System.out.print(numero +" ");
        }

        //Trova gli elementi presenti in array1 ma non in array2*/


        //Scrivi un programma che trovi il primo numero divisibile per 7 in un array di numeri interi.
        // Usa il comando break per interrompere il ciclo appena trovi il numero.

        /*int[] numbers = {12, 18, 22, 35, 44, 49};

        for (int numero : numbers){

            if (numero % 7 == 0){
                System.out.println(numero);
                break;
            }
        }*/









    }
}
