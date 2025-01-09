package co.develhope.eserciziVari;

public class EserciziStringBuilder {
    public static void main(String[] args) {




    /*Scrivi un programma Java che abbia un metodo che prenda due
     stringhe e le compari lessico-graficamente.
     Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti"
     basandosi sul risultato del confronto.
     Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.*/


    }


    public static boolean compara(StringBuilder a, StringBuilder b) {

        return (a.toString().equals(b.toString()));
    }

        /* if (a.toString().equals(b.toString())){
                System.out.println("Le due stringhe sono uguali");
            }else {
                System.out.println("Le due stringhe sono differenti");
            }

        }*/


         /*Scrivi un programma Java che abbia un metodo che prenda il carattere
     in Unicode in un indice specifico all'interno di una stringa e lo stampi.
     Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire
     il carattere in unicode o una stringa di errore.
     Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder*/


    public static String getUnicode(String stringa, int index) {

        StringBuilder risultato = new StringBuilder();

        if (stringa == null) {

            return risultato.append("La stringa è null").toString();
        }
        if (index < 0 || index >= stringa.length()) {

            return risultato.append("Indice non valido").toString();

        }
        char carattere = stringa.charAt(index);
            int unicode = carattere;
            risultato.append("Carattere ").append(carattere).append(" Il suo valore in unicode è: ").append(unicode);

            return risultato.toString();
        }
    }

