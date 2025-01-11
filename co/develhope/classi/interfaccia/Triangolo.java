package co.develhope.classi.interfaccia;

public class Triangolo implements Forma{

    private  double area;
    private double altezza;

    public Triangolo(double area, double altezza) {
        this.area = area;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return (area*altezza)/2;
    }
}
