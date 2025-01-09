package co.develhope.Lezioni.Lezione_16_12;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {



        /*creare un hashmap che ha come valore un Integer
         */

        HashMap<String, Integer> car = new HashMap<>();
        car.put("Alfa",22000);
        car.put("Alpa",23000);
        car.put("Dacia",18000);
        car.put("Fiat",27000);
        car.put("Ferro",222000);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(car.entrySet());

        entryList.sort(Map.Entry.comparingByValue());
        System.out.println(entryList);

        entryList.sort(Map.Entry.<String,Integer>comparingByValue().reversed());
        System.out.println(entryList);









    }

}
