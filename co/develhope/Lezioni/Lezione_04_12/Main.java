package co.develhope.Lezioni.Lezione_04_12;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        /*try {
            isBisestile(2024);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }



    }
    public static boolean isMultiplo (int n , int m){

        if (m % n == 0){
            return true;
        }else {
            throw new IllegalArgumentException("Non è un multiplo");
        }


    }

    public static boolean isPositivo (int n) throws Exception {

        if (n > 0){
            return true;
        }else {
            throw new Exception("non positivo");
        }
    }

    public static boolean checklenght (String uno,int a,int b ){

        if (uno.length() > a && uno.length() < b){
            return true;
        }else {
            throw new IllegalArgumentException("Non in range");
        }

    }


    public static boolean checkCrescente (int a, int b,int c) throws Exception{

        if (a < b && b < c){
            return true;
        }else {
            throw new Exception("ewdj");
        }
    }

    public static boolean isBisestile (int a){

        if ((a % 4 == 0 && a % 100 !=0 )|| a % 400 == 0 ){
            return true;
        }else {
            throw new IllegalArgumentException("non b");
        }
    }

    public static boolean isInLimits (int [] arr, int i){

        if (i >= 0 && i < arr.length){
            return true;
        }else {
            throw new ArrayIndexOutOfBoundsException("jd");
        }
    }*/


        /*//Gestire correttamente un oggetto Person che potrebbe essere nullo e prevenire errori legati a chiamate su oggetti nulli.

        Optional<Person> laPersona = Optional.empty();
        Scanner scan = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String nome = scan.nextLine();
        System.out.println("Quanti anni hai?");
        Integer eta = scan.nextInt();
        if (laPersona.isPresent()){
            laPersona.get().setName(nome);
            laPersona.get().setAge(eta);
        }else{
            laPersona = Optional.of(new Person(nome,eta));
        }*/

    }

        /*Controllo di null Scrivi un programma che definisca una variabile di tipo String e verifichi se è null.
          Se lo è, stampa "La variabile è nulla", altrimenti stampa la sua lunghezza.

          Uso di Optional Crea una funzione che accetti una variabile di tipo String e ritorni un Optional<String>.
          Se la stringa è null, ritorna un Optional.empty(), altrimenti ritorna l'Optional con la stringa.
          Usa il metodo ifPresent per stampare la stringa solo se è presente */




          public static void stringLunghezza (String string){

              Optional<String> optionalString = Optional.ofNullable(string);

              if(optionalString.isEmpty()){

              }


          }
























}

