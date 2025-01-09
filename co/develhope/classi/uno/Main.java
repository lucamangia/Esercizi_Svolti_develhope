package co.develhope.classi.uno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire valore raggio");
        double valoreRaggio = scan.nextDouble();

        Cerchio cerchio = new Cerchio(valoreRaggio);
       // Cerchio cerchio = new Cerchio(5);
        double areaCerchio = cerchio.calcolaArea();
        double circonferenzaCerchio = cerchio.calcolaCirconferenza();
        System.out.println("l'area del cerchio è: " + areaCerchio );
        System.out.println("la circonferenza del cerchio è: " + circonferenzaCerchio );


        cerchio.calcolaArea();
        cerchio.calcolaCirconferenza();
    }

}
