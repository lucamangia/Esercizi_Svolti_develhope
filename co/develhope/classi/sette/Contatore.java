package co.develhope.classi.sette;

public class Contatore {



     static int conteggio = 0;

     public Contatore(){
         conteggio++;
     }
     public static int conteggioAttuale(){
         return conteggio;
     }

}
