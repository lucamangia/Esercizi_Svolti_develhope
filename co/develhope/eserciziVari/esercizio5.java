package co.develhope.eserciziVari;

public class esercizio5 {
    public static void main(String[] args) {

        int[] array      = {56, 78, 45, 79, 34};
        int sommaDispari = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i]%2!=0){
                sommaDispari+=array[i];

            }
        }
        System.out.println(sommaDispari);






    }
}
