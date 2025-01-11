package co.develhope.classi.interfaccia;

public class Rettangolo implements Forma{

    private  double area;
    private double altezza;

    public Rettangolo(double area, double altezza) {
        this.area = area;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return area*altezza;
    }
}
