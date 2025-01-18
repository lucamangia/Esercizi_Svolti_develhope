package co.develhope.Lezioni.Test;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

/*Scrivi un programma che conti quante volte ogni parola appare in una frase (una stringa)
e memorizzi i risultati in una HashMap. La chiave della mappa sarà la parola, e il valore sarà
il numero di volte che quella parola appare nella frase.
Passaggi
Dividi la frase in parole.
Usa una HashMap per contare le occorrenze di ogni parola.
Stampa le parole e le loro frequenze.
"java è bello ma java è difficile java"*/

        String input = "java è bello ma java è difficile java";
        HashMap<String,Integer> hashMap = new HashMap<>();

        String [] strings =input.split(" ");

        for (int i = 0; i < strings.length; i++){
            hashMap.put(strings[i],hashMap.getOrDefault(strings[i],0)+1);






        }

    }

}

