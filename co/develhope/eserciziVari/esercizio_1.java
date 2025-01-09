package co.develhope.eserciziVari;

import java.util.Scanner;

public class esercizio_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Inserisci un numero");
        int a = scanner.nextInt();
        System.out.println(a);*/

        int [] arr = {1,2,3,4};
        System.out.println("Ineserisci un numero da moltiplicare");
        int a = scanner.nextInt();
        int valoreDaStampare;

        for (int i = 0; i< arr.length;i++){
            valoreDaStampare= arr[i]*a;
            System.out.println(""+ valoreDaStampare);
        }
        scanner.close();






    }
}
