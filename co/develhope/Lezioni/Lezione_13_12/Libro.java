package co.develhope.Lezioni.Lezione_13_12;



public record Libro(String titolo, Double prezzo) {

    public Libro{
        if (titolo == null || prezzo == null || titolo.isEmpty()){
            throw new NullPointerException("000");
        }
    }
}
