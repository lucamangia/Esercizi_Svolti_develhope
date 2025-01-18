package co.develhope.stringBuilder;


    public class UnicodeExtractor {
        private String inputString; // La stringa di input
        private int position;       // La posizione dell'indice

        // Costruttore che inizializza stringa e posizione
        public UnicodeExtractor(String inputString, int position) {
            this.inputString = inputString;
            this.position = position;
        }

        // Metodo per ottenere il carattere Unicode o restituire un messaggio di errore
        public String getCharacterUnicode() {
            StringBuilder result = new StringBuilder();

            try {
                // Ottieni il carattere all'indice specificato
                char ch = inputString.charAt(position);

                // Aggiungi il carattere Unicode al risultato
                result.append("Il carattere in posizione ")
                        .append(position)
                        .append(" è: '")
                        .append(ch)
                        .append("' e il suo valore Unicode è: ")
                        .append((int) ch); // Conversione a intero per ottenere il valore Unicode
            } catch (IndexOutOfBoundsException e) {
                // Gestione di indici non validi
                result.append("Errore: L'indice ")
                        .append(position)
                        .append(" non è valido per la stringa data.");
            }

            return result.toString();
        }

        // Metodo principale per eseguire il programma
        public static void main(String[] args) {
            // Esempio 1: Stringa valida e indice valido
            UnicodeExtractor extractor1 = new UnicodeExtractor("Ciao mondo", 3);
            System.out.println(extractor1.getCharacterUnicode());

            // Esempio 2: Stringa valida e indice non valido
            UnicodeExtractor extractor2 = new UnicodeExtractor("Ciao mondo", 20);
            System.out.println(extractor2.getCharacterUnicode());

            // Esempio 3: Stringa vuota e indice
            UnicodeExtractor extractor3 = new UnicodeExtractor("", 0);
            System.out.println(extractor3.getCharacterUnicode());
        }
    }

