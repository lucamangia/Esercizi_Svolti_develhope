package co.develhope.classi.astratte.esercizio;

enum tipoForma{
    TRIANGOLO,
    RETTANGOLO
}

public abstract class Forma {

    private tipoForma tipoForma;

    public Forma(Forma.tipoForma tipoForma) {
        this.tipoForma = tipoForma;
    }

    public abstract double calcolaArea();

    enum tipoForma{
        TRIANGOLO,
        RETTANGOLO
    }
}
