package co.develhope.eserciziVari;

import java.util.Scanner;

public class Esercizio11 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("inserire età");
        int eta = scan.nextInt();
        scan.close();
        int eta2 = 18;
        int tmp = eta >= eta2 ? 1 : 0;

        switch (tmp){
            case 1:
                System.out.println("può votare");
                break;
            default:
                System.out.println("non può votare");









        }






    }
}
