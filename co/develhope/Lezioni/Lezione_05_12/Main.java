package co.develhope.Lezioni.Lezione_05_12;

import java.util.Optional;
import java.util.Scanner;

public class Main {


    /*Roberto Solari (Tutor) — Oggi alle 12:11
      Verifica della Parola Palindroma
      Chiedi all'utente di inserire una stringa, gestisci il tutto con un try catch
      Scrivi un metodo che accetti una stringa e restituisca true se la stringa è palindroma
      (ovvero se si legge uguale da sinistra a destra e viceversa),
      e false altrimenti. Non utilizzare StringBuilder o altre classi esterne.


 Suggerimenti:
Puoi usare due indici per confrontare i caratteri da sinistra e da destra.
Assicurati di considerare eventuali spazi o lettere maiuscole/minuscole, ma non è obbligatorio */


    public static boolean isPalindroma (String parola) throws Exception {

        if (parola == null || parola.isEmpty()){
            throw new Exception("La stringa non può essere null");
        }
        boolean isPalindroma = true;
        for (int i = 0;i < parola.length()/2;i++){
            char first = parola.charAt(i);
            char last  = parola.charAt(parola.length() - 1 - i);
            if (first != last){
                isPalindroma = false;
                break;
            }
        }
        return isPalindroma;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isPalindroma = false;

        while (!isPalindroma){
            System.out.println("Inserisci una parola");
            String input = scan.nextLine();
            try {
                isPalindroma = isPalindroma(input);
            } catch (Exception e) {
                System.out.println("input non valido");
            }
        }
    }
}
