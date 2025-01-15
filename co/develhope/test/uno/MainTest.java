package co.develhope.test.uno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    private final Main testing = new Main();



    @Test
    void divisione() {
        Double result = testing.divisione(4,2);
        assertEquals(2,result,"Dovrebbe essere 2");

    }
}