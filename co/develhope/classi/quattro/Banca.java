package co.develhope.classi.quattro;

public class Banca {

    private double saldo;

    public Banca(){
        this.saldo = 0;
    }

    public void prelevare(double sommaDenaro){
        if (this.saldo >= sommaDenaro ) {
            this.saldo -= sommaDenaro;

        }else {
            System.out.println("Saldo insufficiente");
        }
    }

    public void depositare (double sommaDenaro){
        this.saldo += sommaDenaro;
    }

    public double getSaldo() {
        return saldo;
    }
}
