package co.develhope.Lezioni.Lezione_09_12;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Studente> studente = new ArrayList<>();
        studente.add(new Studente("marco",21));
        studente.add(new Studente("federico",21));

        for(Studente student : studente){
            System.out.println(student);
        }
    }
}
