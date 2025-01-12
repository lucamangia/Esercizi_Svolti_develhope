package co.develhope.HashMap;

import co.develhope.Lezioni.Lezione_04_12.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.

        HashMap<String, String> capitali = new HashMap<>();

        capitali.put("Inghilterra", "Londra");
        capitali.put("Italia", "Roma");


        Map<String, String> capitali2 = new HashMap<String, String>(Map.of("Inghilterra", "Londra", "Italia", "Roma"));


        Map<String, String> capitali3 = new HashMap<String, String>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, String>("Inghilterra", "Londra"),
                new AbstractMap.SimpleEntry<String, String>("Italia", "Roma")));


        System.out.println(capitali);
        System.out.println(capitali2);
        System.out.println(capitali3);


        System.out.println("----------------------------------------------------------");

        /*Creare un hashmap, prendere tutti i valori, ordinarli e stamparli

        HashMap<String, Integer> map = new HashMap<>();
        map.put("B", 45);
        map.put("A", 12);
        map.put("C", 78);
        map.put("D", 31);

        ArrayList<Integer> valori = new ArrayList<>(map.values());
        Collections.sort(valori);
        System.out.println(valori);
        Collections.sort(valori,
                new Comparator<Integer>(){
            @Override
                    public int compare(Integer uno,Integer due){
                if (uno % 2 == 0 && due % 2 != 0){
                    return -1;
                }else if (uno % 2 != 0 && due % 2 == 0){
                    return 1;
                }else {
                    return uno.compareTo(due);
                }

            }

                });

        System.out.println(valori);
        */









    }

    public record point(int x,int y){};
}
