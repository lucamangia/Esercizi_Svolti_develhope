package co.develhope.eserciziVari;

public class Gestore {

      /*Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e
    gestisca sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
    Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/

    int [] arrray;
    int divisore;

    public static void arrTester (int [] arrray,int divisore)throws ArithmeticException,IndexOutOfBoundsException{

        for (int i = 0; i <= arrray.length; i++){

            if (i== arrray.length/2 && divisore != 0){
                int random = arrray [i];
                System.out.println("test divisione :" + random/divisore);

            }else {
                throw new ArithmeticException("Divisione per '0' non accettata");
            }
            if (i == arrray.length){
                throw new IndexOutOfBoundsException();
            }


        }



    }

}
