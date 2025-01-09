package co.develhope.Lezioni.Esercitazioni_09_01.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Auto auto = new Auto(2000, "EW107BH", "Gtr", "Nissan");

    }



}
/*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.*/


class Auto {
   private double cilindrata;
   private String targa;
   private String modello;
   private String marca;


   public Auto(double cilindrata,String targa,String modello,String marca){
       this.cilindrata = cilindrata;
       this.targa      = targa;
       this.modello    = modello;
       this.marca      = marca;
   }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}


