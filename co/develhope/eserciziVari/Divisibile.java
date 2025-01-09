package co.develhope.eserciziVari;

public class Divisibile {

    int numero;
    int divisore;

    public static void isDivisibile(int numero, int divisore)throws ArithmeticException{

        if (divisore != 0){
            System.out.println("il risultato è: " + numero/divisore);

        }else {
            throw new ArithmeticException();
        }

    }

}
