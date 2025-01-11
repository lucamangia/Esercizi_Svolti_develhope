package co.develhope.hashset.esercizi.due;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = creaHashSet();
        Integer integer = 1;
        hashSet.contains(integer);
        hashsetPrint(hashSet);


    }
    /*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l'elemento sia parte del Set e stampare il risultato*/

    public static HashSet<Integer> creaHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();


        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        return hashSet;
    }
    public static void hashsetPrint(HashSet<Integer>hashSet){

        for (Integer numero : hashSet){
            System.out.println(numero);
        }
        System.out.println(hashSet.size());
    }

}
