package co.develhope.hashset.esercizi.uno;

import java.util.HashSet;


public class Main {
    /*Scrivere una funzione che restituisca un hashset riempito
    Leggere l'hashSet e stampre grandezza ed elementi*/
    public static void main(String[] args) {

        HashSet<Integer> hashSet = creaHashSet();

        hashsetPrint(hashSet);







    }
    public static HashSet<Integer> creaHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();


        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        return hashSet; // Restituisce l'HashSet riempito
    }
    public static void hashsetPrint(HashSet<Integer>hashSet){

        for (Integer numero : hashSet){
            System.out.println(numero);
        }
        System.out.println(hashSet.size());
    }
}










