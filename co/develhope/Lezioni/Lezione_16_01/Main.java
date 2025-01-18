package co.develhope.Lezioni.Lezione_16_01;

public class Main {
    /*We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    Loop over and then return the given array of non-empty strings as follows:
    if a string matches an earlier string in the array, swap the 2 strings in the array.
    When a position in the array has been swapped, it no longer matches anything.
     Using a map, this can be solved making just one pass over the array. More difficult than it looks.
     */
//allSwap(["ab", "ac"]) → ["ac", "ab"]

   /* public static void main(String[] args) {

        String [] array = {"banana","maiale", "basta", "bastardo","mordor", "alibaba", "giochi","alt"};
        allSwap(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);

        }


    }

    /*se prima lettera è presente nella mappa -> inverti parole e cancella chiave
        se prima lettera non presente -> aggiungere alla mappa

    public static void allSwap (String[] stringhe) {
        HashMap<Character, Integer> mappa = new HashMap<>();

        for (int i = 0; i < stringhe.length; i++) {

            char c = stringhe[i].charAt(0);

            if (mappa.containsKey(c)) {
                Integer index = mappa.get(c);
                String tmp = stringhe[index];
                stringhe[index] = stringhe[i];
                stringhe[i] = tmp;
                mappa.remove(c);

            } else {
                mappa.put(c, i);
            }
        }
    }*/

    public static void main(String[] args) {
        /*supponiamo che abbiamo tre numeri interi, a, b, e c, e
        che dobbiamo restituire il loro prodotto. Tuttavia, se uno dei numeri è 10,
         non deve essere conteggiato nel prodotto, e anche i numeri a destra di esso devono essere ignorati.
          Se il numero b è 10, ad esempio, solo a verrà considerato. Se c è 10, solo a e b saranno considerati.

        Descrizione:

        Se uno dei numeri è 10, ignoriamo quel numero e tutti i numeri successivi.
                Restituiamo il prodotto dei numeri che non sono 10.*/
    }


}