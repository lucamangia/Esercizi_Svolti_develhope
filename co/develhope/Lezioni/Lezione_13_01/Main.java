package co.develhope.Lezioni.Lezione_13_01;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    /*
Calculate the number of grains of wheat on a chessboard given that the number on each square doubles.
There once was a wise servant who saved the life of a prince. The king promised to pay whatever the servant could dream up.
 Knowing that the king loved chess, the servant told the king he would like to have grains of wheat. One grain on the first square of a chess board,
 with the number of grains doubling on each successive square.
There are 64 squares on a chessboard (where square 1 has one grain, square 2 has two grains, and so on).
Write code that shows:

how many grains were on a given square, and
the total number of grains on the chessboard

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire un numero di una casella da 1 a 64");
        int casellaInput = scanner.nextInt();
        Long grains;
        for (int i = 0; i < 64; i++){
            grains = (long) Math.pow(2,i);
            if (casellaInput == i){
                System.out.println(grains);
            }
        }
        grains = (long) Math.pow(2,casellaInput-1);
        System.out.println(grains);
        BigInteger totGrains = BigInteger.ZERO;
        for (int i = 0; i < 64; i++){
            grains = (long) Math.pow(2,i);
            totGrains = totGrains.add(BigInteger.valueOf(grains));
        }
        System.out.println(totGrains);
    }


*/
/*You work for a company that sells fonts through their website.
 They'd like to show a different sentence each time someone views a font on their website.
  To give a comprehensive sense of the font, the random sentences should use all the letters in the English alphabet.
They're running a competition to get suggestions for sentences that they can use.
You're in charge of checking the submissions to see if they are valid.
Note
Pangram comes from Greek, παν γράμμα, pan gramma, which means "every letter".
The best known English pangram is:
The quick brown fox jumps over the lazy dog.
Instructions
Your task is to figure out if a sentence is a pangram.
A pangram is a sentence using every letter of the alphabet at least once. It is case insensitive,
 so it doesn't matter if a letter is lower-case (e.g. k) or upper-case (e.g. K).
For this exercise, a sentence is a pangram if it contains each of the 26 letters in the English alphabet.

 */

    /*Nel Cifrario di Cesare, la "chiave" è rappresentata dal numero di posizioni con cui spostare ogni lettera nell'alfabeto.
     Per esempio, se la chiave è 3, la lettera "A" diventa "D", "B" diventa "E", e così via. Questo tipo di cifratura è simmetrica,
      il che significa che la stessa operazione viene usata sia per cifrare che per decifrare il testo.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire una frase");
        String stringInput = scan.next();
        System.out.println("Inserire le posizioni di cui si vuole spostare il carattere");
        int intInput = scan.nextInt();

        char [] fraseDaCifrare = stringInput.toCharArray();


    }
}
