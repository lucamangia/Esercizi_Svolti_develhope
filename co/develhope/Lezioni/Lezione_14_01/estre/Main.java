package co.develhope.Lezioni.Lezione_14_01.estre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    /*Determine if a word or phrase is an isogram.
An isogram (also known as a "non-pattern word") is a word or phrase without a repeating letter,
 however spaces and hyphens are allowed to appear multiple times.
  Examples of isograms:
lumberjacks
background
downstream
six-year-old
The word isograms, however, is not an isogram, because the s repeats.
}

    public static boolean isIsogram (String stringInput){
        stringInput = stringInput.toLowerCase();
        boolean result = true;
        ArrayList<Character> characters = new ArrayList<>();
        for (Character character : stringInput.toCharArray()){
            if (Character.isLetter(character)){
                characters.add(character);
            }
        }
        for (int i = 0; i < characters.size(); i++){
            if (characters.get(i).equals(characters.get(i+1))){
                result = false;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String string = "Ciao Mondo";

        System.out.println(isIsogram(string));

    }
*/
    /*se una stringa B è una rotazione di una stringa A,
     allora B sarà sempre una sottostringa di A + A (ovvero la concatenazione di A con sé stessa).


    public  static  boolean areRotazione(String string,String string2){
        if (string.length() != string2.length()){
            return false;
        }
        string = string + string;
        return string.contains(string2);
    }


    public static int sommaCifre(String string){
        int somma = 0;
        for (Character character : string.toCharArray()){
            if(Character.isDigit(character)){
                somma += Character.getNumericValue(character);
            }
        }
        return somma;
    }

    */

    /*Somma di tutti i numeri in un intervallo
Scrivi una funzione che prenda due numeri interi (inclusi nell'intervallo)
e calcoli la somma di tutti i numeri compresi in questo intervallo.
Esempio:
Input: 1, 5
Output: 15 (1 + 2 + 3 + 4 + 5)
*/

/*In un array di numeri da 1 a N (dove un solo numero manca),
trova quale numero manca. Utilizza una HashMap per tenere traccia dei numeri visti

[1, 2, 4, 6, 3]
manca 5
 */

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 5, 6};

        System.out.println(numeroMancante(num));





    }

    public static String numeroMancante(int [] numbers) {
        HashMap<Integer, Boolean> hashMapBoolean = new HashMap<>();
        for (int number : numbers) {
            hashMapBoolean.put(number,true);
        }
        int numeroTrovato;
        int minArr = numbers[0];
        int maxArr = numbers[0];
        for (int number : numbers) {
            if (minArr > number) {
                minArr = number;
            }
            if (maxArr < number) {
                maxArr = number;
            }
        }

          for (int i = minArr; i < maxArr; i++){
            if (!hashMapBoolean.containsKey(i)){
                hashMapBoolean.get(i);
                numeroTrovato = i;

                return Integer.toString(numeroTrovato);
            }
        }
        return "Nessun numero mancante";






    }



}

