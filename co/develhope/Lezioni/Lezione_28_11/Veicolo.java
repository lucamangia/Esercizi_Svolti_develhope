package co.develhope.Lezioni.Lezione_28_11;

public abstract class Veicolo {


    public String tipologiaCarburante;
    public double prezzoCarburante;

    public Veicolo (String tipologiaCarburante,double prezzoCarburante){

        this.tipologiaCarburante = tipologiaCarburante;
        this.prezzoCarburante = prezzoCarburante;
    }

    public String getTipologiaCarburante() {
        return tipologiaCarburante;
    }

    public void setTipologiaCarburante(String tipologiaCarburante) {
        this.tipologiaCarburante = tipologiaCarburante;
    }

    public double getPrezzoCarburante() {
        return prezzoCarburante;
    }

    public void setPrezzoCarburante(double prezzoCarburante) {
        this.prezzoCarburante = prezzoCarburante;
    }

    
}
