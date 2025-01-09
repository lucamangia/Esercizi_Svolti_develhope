package co.develhope.funzioni;

import java.util.Scanner;
public class esercizio_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire un numero: ");
        int a = scan.nextInt();
        System.out.println("Inserire un secondo numero");
        int b = scan.nextInt();

        int c = a+b;
        System.out.println("La somma dei numeri inseriti è: "+ c);

    }

}
