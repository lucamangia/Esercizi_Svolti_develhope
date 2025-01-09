package co.develhope.ifstatements;

import java.util.Scanner;

public class Esercizio1_2 {

    public static void printFizzBuzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Esercizio1_2");
        }
        // Controllo se il numero è multiplo di 3
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        }

        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }

        else {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();


        printFizzBuzz(numero);

        scanner.close();
    }
}



