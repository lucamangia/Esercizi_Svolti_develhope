package co.develhope.ereditarieta.due;

public class Main {
    /*Scrivere un programma che contenga una classe chiamata Forma
     ed un metodo chiamato calcolaArea() che stampi l'area della forma.
      Crea poi una sottoclasse chiamata Rettangolo che fa override del
      metodo calcolaArea() per calcolare l'area del rettangolo.
     */


}
abstract class Forma{

    public void calcolaArea(double altezza, double base){}


}
class Rettangolo extends Forma{

    @Override
    public void calcolaArea(double altezza, double base){
        double valoreArea = altezza*base;
        System.out.println(valoreArea);


    }

    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.calcolaArea(15,22.2);
    }
}