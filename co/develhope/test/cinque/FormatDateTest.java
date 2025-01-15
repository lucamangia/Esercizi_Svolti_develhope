package co.develhope.test.cinque;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatDateTest {

    @Test
    void modificaData() {
        String input = "2023-03-01T13:00:00Z";
        String risultatoAtteso = "mercoledì 8 febbraio 2024 alle 14:00:00 CET";

        String risultato = FormatDate
                .modificaData(input);

        assertEquals(risultatoAtteso, risultato, "La data modificata non è corretta");
}
}
