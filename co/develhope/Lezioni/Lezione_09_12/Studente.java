package co.develhope.Lezioni.Lezione_09_12;

import java.util.Objects;

public class Studente {

    /*Creare una classe Student che accetti nel costruttore il parametro name (String) e age (Int)
      In questa classe avere i metodi pubblici per ottenere le informazioni.
      Creare un ArrayList con n elementi e stamparlo in console.
      Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console */


    private String name;
    private int age;

    public Studente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


