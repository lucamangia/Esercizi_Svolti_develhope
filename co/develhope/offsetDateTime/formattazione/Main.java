package co.develhope.offsetDateTime.formattazione;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {


        System.out.println("-------------------Esercizio 1 -----------------------");
   /* Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
    Formatta la data ottenuta in FULL, MEDIUM e SHORT
    Stampa le varie versioni*/

    OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    String dataShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    System.out.println(dataShort);

    String dataMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    System.out.println(dataMedium);

    String dataLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    System.out.println(dataLong);

    String dataFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    System.out.println(dataFull);

        System.out.println("-------------------Esercizio 2 -----------------------");


       /* Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
        Formatta la data ottenendo 01 marzo 2023
        Stampa sulla console*/

        OffsetDateTime data2 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataLong2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(dataLong2);









    }
}

