package co.develhope.ereditarieta.due;

class Rettangolo extends Forma {
    private double altezza;
    private double base;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public double calcolaArea(){
        return altezza*base;
    }


}



