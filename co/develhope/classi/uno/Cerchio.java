package co.develhope.classi.uno;

public class Cerchio {

    public Cerchio() {
    double raggio;
    }
    private double raggio;


    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea(){

        return (Math.PI* (raggio*2));

    }
    public double calcolaCirconferenza(){

        return ((2*Math.PI)*raggio);

    }

}




