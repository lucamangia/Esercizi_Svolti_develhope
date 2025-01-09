package co.develhope.operatori.logici;

import java.util.Scanner;

public class Esercizio2 {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numeroInserito: ");
        int numeroInserito = scanner.nextInt();

        if (isEven(numeroInserito)) {
            System.out.println(numeroInserito + " è pari.");
        } else {
            System.out.println(numeroInserito + " è dispari.");
        }
        scanner.close();
    }
}
