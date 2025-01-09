package co.develhope.Lezioni.Lezione_18_12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, LocalDate> dateHashMap = new HashMap<>(10);

        LocalDate data = LocalDate.now();

        for (int i = 0; i < 10; i++){
            data = data.plus((long)(Math.random()*100), ChronoUnit.DAYS);

            dateHashMap.put(i,data);
        }

        List<Map.Entry<Integer, LocalDate>> entryList = new ArrayList<>(dateHashMap.entrySet());

        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        System.out.println(entryList);

    }
}
