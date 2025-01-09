package co.develhope.Lezioni.Lezione_27_11;

public class Auto extends Veicolo {


    public Auto(String targa) {
        super(targa);
    }

    @Override
    public void muoviti() {
        System.out.println("L'auto si muove su strada.");

    }
}

