package co.develhope.offsetDateTime.formattazione.tre;

import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public class Date3 {
        public static void main(String[] args) {
            OffsetDateTime obj = OffsetDateTime.parse("2023-03-01T13:00:00Z");

            int year = obj.getYear();
            Month month = obj.getMonth();
            String dayOfWeek = obj.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
            int dayOfMonth = obj.getDayOfMonth();


            System.out.println(dayOfWeek);
            System.out.println(dayOfMonth);
            System.out.println(year);
            System.out.println(month);
        }
    }
}
