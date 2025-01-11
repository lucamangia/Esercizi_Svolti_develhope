package co.develhope.nullability;

public class Main {
   /* Scrivere una funzione che accetti in input un numeratore e un denominatore
    Controlli che il numeratore e il denominatore non siano null
    Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.*/


    public static void nullability(Integer num,Integer den)throws NullPointerException{
        try {

            if (num == null || den == null) {
                throw new NullPointerException("numeratore o denominatore nullo");
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        Integer a = 5;
        Integer b = null;

        nullability(a,b);

        try{
            Integer divisione = a/b;
            nullability(a,b);
        }catch (NullPointerException  e){
            System.out.println(e.getMessage());
        }


    }
}



