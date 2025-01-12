

import java.math.BigDecimal;

public class solution {
    /*Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
    (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
     Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
     Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
     */



}
enum Operazioni{
    ADDIZIONE,
    SOTTRAZIONE,
    MOLTIPLICAZIONE,
    DIVISIONE,
    MIN,
    MAX;
}
public static BigDecimal operations(Operazioni operazione,BigDecimal uno,BigDecimal due){

    switch (operazione){
        case ADDIZIONE -> {
            return uno.add(due);

        }
        case SOTTRAZIONE -> {
            return uno.subtract(due);
        }
        case MOLTIPLICAZIONE -> {
            return uno.multiply(due);
        }
        case DIVISIONE -> {
            return uno.divide(due);

        }
        case MIN ->{
            return uno.min(due);

        }
        case MAX -> {
            return uno.max(due);

        }
        default ->
                throw new RuntimeException("OPerazione non supportata");
    }


}

public void main() {
    BigDecimal bigDecimal = BigDecimal.valueOf(5);
    BigDecimal bigDecimal2 = BigDecimal.valueOf(7);

    Operazioni operazioni = Operazioni.ADDIZIONE;

    BigDecimal risultato = operations(operazioni,bigDecimal,bigDecimal2);
    System.out.println(operazioni);
    System.out.println(bigDecimal);
    System.out.println(bigDecimal2);
    System.out.println(risultato);


}




