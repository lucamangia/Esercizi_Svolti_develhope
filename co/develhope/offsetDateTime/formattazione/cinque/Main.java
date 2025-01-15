package co.develhope.offsetDateTime.formattazione.cinque;

import java.time.OffsetDateTime;

public class Main {

        public static void main(String[] args) {
            OffsetDateTime obj = OffsetDateTime.parse("2023-03-01T13:00:00Z");
            OffsetDateTime obj2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
            OffsetDateTime currentDate = OffsetDateTime.now();

            if (obj.equals(currentDate) && obj2.equals(currentDate)) {
                System.out.println("Le date sono uguali alla data odierna");
            }

            if (obj.equals(obj2)) {
                System.out.println("Le date sono uguali");
            } else if (obj.isBefore(obj2)){
                System.out.println("La prima data è prima della seconda");
            } else if (obj2.isAfter(obj)) {
                System.out.println("La seconda data è dopo la prima");
}
}
    }

