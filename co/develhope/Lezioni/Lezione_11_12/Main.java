package co.develhope.Lezioni.Lezione_11_12;

import java.util.*;

public class Main {
    public static void main(String[] args) {



    /*Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
    In questa classe avere i metodi pubblici per ottenere le informazioni.
    Creare un ArrayList con 12 elementi e stamparlo in console.
    Mettere in ordine la collezione e stampare il risultato

        ArrayList<Student> students = new ArrayList<>();
        int index;
        Student student1 = new Student("Giovanni", 21);
        Student student2 = new Student("luigi", 22);
        Student student3 = new Student("Mohammad", 24);
        Student student4 = new Student("Giorgio", 27);
        Student student5 = new Student("Andrea", 28);
        Student student6 = new Student("Lorenzo", 21);
        Student student7 = new Student("Melina", 25);
        Student student8 = new Student("Andrea", 24);
        Student student9 = new Student("Sara", 29);
        Student student10 = new Student("Loredana", 98);
        Student student11 = new Student("Monica", 78);
        Student student12 = new Student("Chiara", 16);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);



        System.out.println("ordine iniziale");
        for(Student student : students){
            System.out.println(student);
        }
        System.out.println(" ");

        students.sort(Comparator.comparing(Student ::getName).thenComparingInt(Student ::getAge));



        System.out.println("in base al nome: ");
        for(Student student : students){
            System.out.println(student);
        }*/


        System.out.println("---------------------------------------------------------------------------");


        /*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
          In questa classe avere i metodi pubblici per ottenere le informazioni.
          Creare un LinkedList con elementi e stamparlo in console.
          Aggiungere un elemento al primo posto della lista e uno all'ultimo
          Stampare la collezione aggiornata */

        LinkedList<Fruit> fruits = new LinkedList<>();

        Fruit fruit0 = new Fruit("Pompelmo");
        Fruit fruit1 = new Fruit("Mandarino");
        Fruit fruit2 = new Fruit("Anguria");
        Fruit fruit3 = new Fruit("Ananas");

        fruits.add(fruit0);
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);

        for(Fruit fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println(" ");

        fruits.addFirst(new Fruit("Mela"));
        fruits.addLast(new Fruit("Pera"));

        for (Fruit fruit : fruits){
            System.out.println(fruit);
        }
    }
}
