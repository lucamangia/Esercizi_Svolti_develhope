package co.develhope.classi.astratte.esercizio;

public class Rettangolo extends Forma{

    private double altezza;
    private double base;

    public Rettangolo(double altezza, double base) {
        super(tipoForma.RETTANGOLO);
        this.altezza = altezza;
        this.base = base;

    }

    @Override
    public double calcolaArea() {
        return altezza*base;
    }
}
