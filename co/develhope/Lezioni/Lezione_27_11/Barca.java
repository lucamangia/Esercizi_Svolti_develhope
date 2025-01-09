package co.develhope.Lezioni.Lezione_27_11;

public class Barca extends Veicolo{


    public Barca(String targa) {
        super(targa);
    }

    @Override
    public void muoviti() {
        System.out.println("La barca si muove sull'acqua.");

    }
}
