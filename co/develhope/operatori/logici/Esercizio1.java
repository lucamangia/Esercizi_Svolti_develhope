package co.develhope.operatori.logici;

public class Esercizio1 {

    // Metodo che verifica se il valore è compreso tra limiteInferiore e limiteSuperiore
    public static void verificaIntervallo(int limiteInferiore, int limiteSuperiore, int valoreDiConfronto) {
        if (valoreDiConfronto >= limiteInferiore && valoreDiConfronto <= limiteSuperiore) {
            System.out.println("Il valore " + valoreDiConfronto + " è compreso tra " + limiteInferiore + " e " + limiteSuperiore + ".");
        } else {
            System.out.println("Il valore " + valoreDiConfronto + " NON è compreso tra " + limiteInferiore + " e " + limiteSuperiore + ".");
        }
    }

    // Metodo main per testare il metodo verificaIntervallo
    public static void main(String[] args) {
        // Esempio di test
        int limiteInferiore = 10;
        int limiteSuperiore = 20;
        int valoreDiConfronto = 20;

        verificaIntervallo(limiteInferiore, limiteSuperiore, valoreDiConfronto);  // Output: Il valore 15 è compreso tra 10 e 20.
    }
}
