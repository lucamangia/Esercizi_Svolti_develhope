package co.develhope.Lezioni.Lezione_26_11;

public class Main {
    public static void main(String[] args) {



    /*Creare un sistema base per la gestione degli utenti che utilizzi incapsulamento ed ereditarietà.
    Il sistema dovrà consentire di creare utenti con uno username e una password che rispetti determinati criteri di sicurezza.
     Ecco una traccia per l'esercizio che sfrutta i principi di incapsulamento ed ereditarietà in modo semplice:
     Traccia dell'esercizio: Gestione Utenti
     Obiettivo
     Creare un sistema base per la gestione degli utenti che utilizzi incapsulamento ed ereditarietà.
      Il sistema dovrà consentire di creare utenti con uno username e una password che rispetti determinati criteri di sicurezza.
    Requisiti
    Criteri della password:
     Deve essere lunga almeno 8 caratteri.
     Deve contenere almeno una lettera maiuscola,
     Struttura delle classi:
     Una classe base User che rappresenti un utente generico con username e password.
     Una sottoclasse AdminUser che rappresenti un amministratore, con funzionalità aggiuntive (ad esempio, mostrare informazioni di base sull'utente).
     Validazione della password:
     Il setter della password deve controllare che la password rispetti i criteri.
     Se non li rispetta, deve lanciare un messaggio d'errore.
     */

    /*Concatenazione di Stringhe
     Obiettivo: Crea una classe StringConcatenator con diversi metodi concat(), che concatenano stringhe di diverso tipo.
     Istruzioni:
     Crea una classe StringConcatenator.
     Aggiungi un metodo concat(String s1, String s2) che concatena due stringhe.
     Aggiungi un altro metodo concat(String s1, String s2, String s3) che concatena tre stringhe.
     Aggiungi un altro metodo concat(String s1, int n) che concatena una stringa e un numero.
     Scrivi il codice nel main() per testare ogni versione del metodo concat()*/


        StringConcatenator str1 = new StringConcatenator();
        System.out.println(str1.concat("ciao","dsd","dded"));

    }
}
