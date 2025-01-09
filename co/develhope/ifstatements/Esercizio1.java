package co.develhope.ifstatements;

import java.util.Scanner;

public class Esercizio1 {
    public static void FrizzBuzz(int numero){
        if (numero % 3 == 0 && numero % 5 == 0){
            System.out.println("FrizzBuzz");
        }
        else if(numero % 3 == 0 ){
            System.out.println("Frizz");
        }
        else if (numero % 5 == 0){
                System.out.println("Buzz");
        }else {
                System.out.println("The numeber is't Frizz or Buzz");
            }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire un numero");
        int number = scan.nextInt();

        FrizzBuzz(number);
        scan.close();
        }
}

