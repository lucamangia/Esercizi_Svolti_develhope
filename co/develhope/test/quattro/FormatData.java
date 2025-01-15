package co.develhope.test.quattro;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class FormatData {

    public static int getAnno(String date) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date);
        return offsetDateTime.getYear();
    }

    public static int getMese(String date) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date);
        return offsetDateTime.getMonth().getValue();
    }

    public static int getGiorno(String date) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date);
        return offsetDateTime.getDayOfMonth();
    }

    public static DayOfWeek getGiornoSettimana(String date) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date);
        return offsetDateTime.getDayOfWeek();
}

}