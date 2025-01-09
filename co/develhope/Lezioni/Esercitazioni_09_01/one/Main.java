package co.develhope.Lezioni.Esercitazioni_09_01.one;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Given a string of digits, output all the contiguous substrings of length n
        in that string in the order that they appear.
         For example, the string "49142" has the following 3-digit series:
        "491"
        "914"
        "142"
        And the following 4-digit series:
        "4914"
        "9142"
        And if you ask for a 6-digit series from a 5-digit string, you deserve whatever you get.
        Note that these series are only required to occupy adjacent positions in the input;
         the digits need not be numerically consecutive.

        System.out.println("digita una stringa di numeri");
        Scanner scanner = new Scanner(System.in);
        String stringa = scanner.nextLine();
        System.out.println("");
        System.out.println("digitare la lunghezza della serie");
        int lunghezza = scanner.nextInt();
        scanner.close();
        char[] chars = new char[stringa.length()];

        for (int i = 0; i < chars.length; i++){
            chars[i] = stringa.charAt(i);

        }*/

        /*
        M       D      C      L     X    V    I
       1000    500    100    50    10    5    1
         */

        Integer[] arabi =     {1000, 900, 500, 400, 100,  90,   50,  40,  10,    9,    5,   4,    1};
        String[] romani = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        HashMap<Integer,String> converter = new HashMap<>();
        for (int i = 0; i < arabi.length; i++){
            converter.put(arabi[i],romani[i]);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        Integer input = scanner.nextInt();


        for (int i = 0; i < converter.size(); i++){
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;
            if (input >= arabi[i]) {
                num1 = input - arabi[i];
                System.out.print(converter.get(arabi[i]));

            }
            if (num1 >= arabi[i]) {
                num2 = input - arabi[i];
                System.out.print(converter.get(arabi[i]));

            }
            if (num2 >= arabi[i]) {
                num3 = input - arabi[i];
                System.out.print(converter.get(arabi[i]));

            }
            if (num4 >= arabi[i]) {
                num5 = input - arabi[i];
                System.out.print(converter.get(arabi[i]));

            }









        }





















    }
}
