package co.develhope.eserciziVari;

public class Esercizio6 {
    public static void main(String[] args) {

        int[] firstArray  = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};
        int[] thirdArray  = new int[firstArray.length+ secondArray.length];
        int index = 0;

        for( int i = 0; i < firstArray.length;i++){
            thirdArray[index]=firstArray[i];
            index++;
        }
        for (int i= 0; i < secondArray.length;i++){
            thirdArray[index]=secondArray[i];
            index++;
        }

}
}

