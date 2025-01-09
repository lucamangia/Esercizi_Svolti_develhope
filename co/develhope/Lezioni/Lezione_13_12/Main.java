package co.develhope.Lezioni.Lezione_13_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




       /* try {
            Libro libro = new Libro("Harry Potter", 12.45);
            Libro libro2 = new Libro("Harry Potter 2", 45.48);
            Libro libro3 = new Libro(null, 4.48);
            Libro libro4 = new Libro("Harry", null);

            ArrayList<Libro> libri = new ArrayList<>();
            libri.add(libro);
            libri.add(libro2);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }*/

        HashMap<Integer, Libro> libri = new HashMap<>();

        Libro libro  = new Libro("Harry Potter", 12.45);
        Libro libro2 = new Libro("Harry Potter 2", 15.48);
        Libro libro3 = new Libro("20 sigarette a Nassirya",16.50);

        libri.put(1,libro);
        libri.put(2,libro2);
        libri.put(3,libro3);
        aggiungiLibro(libri,new Libro("Harry Potter", 12.45));
        aggiungiLibro(libri,new Libro("Harry Potter 3", 15.48));
        aggiungiLibro(libri,new Libro("20 sigarette a Nassirya",16.50));

        for (int i = 1; i <= libri.size(); i++){
            System.out.println(i + " " + libri.get(i));



        }


    }

    public static void aggiungiLibro(HashMap<Integer,Libro> hashMaplibro, Libro libro){

        if (hashMaplibro.containsValue(libro)){
            System.out.println("il libro è presente");

        }else {
            hashMaplibro.put(hashMaplibro.size() + 1,libro);
            System.out.println("il libro è stato aggiunto");
        }


    }

}
