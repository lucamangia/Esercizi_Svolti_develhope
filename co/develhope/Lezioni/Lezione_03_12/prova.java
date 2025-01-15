package co.develhope.Lezioni.Lezione_03_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prova {
    public static void main(String[] args) {

        /*Scrivere una funzione che controlli se un numero int è in un determinato range.
        Se lo, è ritorna true ; se non lo è, lancia un'eccezione.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int a = scan.nextInt();
        boolean range = false;

        try{

            if ( a > 0 && a < 5){
                range = true;
                System.out.println("il numero è nel range");}

        }catch (ArithmeticException e){
            System.out.println("fuori range");
        }

        Integer a1 = 10;
        Integer b = 10;
        boolean b1 = a == b;
        List<String>strings = new ArrayList<>();


    }

}
