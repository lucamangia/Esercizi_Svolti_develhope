package co.develhope.ereditarieta.due;

class Triangolo extends Forma {
    private double altezza;
    private double base;

    public Triangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public double calcolaArea(){
        return (altezza*base)/2;
    }


}
