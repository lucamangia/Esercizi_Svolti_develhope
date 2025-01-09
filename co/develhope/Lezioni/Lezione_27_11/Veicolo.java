package co.develhope.Lezioni.Lezione_27_11;

public abstract class Veicolo {

    private String targa;

    public Veicolo(String targa) {
        this.targa = targa;
    }
   public void mostraDettagli(){
       System.out.println("La targa è: " + targa);
    }

   public abstract void muoviti();
}
