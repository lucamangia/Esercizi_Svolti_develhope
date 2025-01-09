package co.develhope.esercitazione.natale.Lunedi23;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire dieci numeri");
        System.out.println();

        int index = 0;
        ArrayList<Integer> listInput = new ArrayList<>(4);
        do {
            System.out.println("Inserisci un numero");
            int input = scan.nextInt();
            listInput.add(input);
            index++;

        } while (index != 4);

        Integer[] array = listInput.toArray(new Integer[listInput.toArray().length]);

        for (int i = 0; i < array.length; i++) {
            int somma = 0;
            if (somma + array[i] == 0) {
                System.out.println(array[i].toString());
            }
        }
    }
}








