package co.develhope.Lezioni.Lezione_11_12;

public class Fruit {

        /*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
          In questa classe avere i metodi pubblici per ottenere le informazioni.
          Creare un LinkedList con elementi e stamparlo in console.
          Aggiungere un elemento al primo posto della lista e uno all'ultimo
          Stampare la collezione aggiornata */

    private String name;

    public Fruit (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
