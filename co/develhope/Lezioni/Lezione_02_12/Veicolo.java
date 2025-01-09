package co.develhope.Lezioni.Lezione_02_12;

public class Veicolo {


    protected String marca;
    protected String modello;
    protected double cilindrata;

    public Veicolo(){
    }

    private Veicolo (String marca,String modello,double cilindrata){
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }





}
