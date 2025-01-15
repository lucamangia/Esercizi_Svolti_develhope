package co.develhope.Lezioni.Esercitazioni_15_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    /*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
at least one of the pair is that value. Return true if the given value is everywhere in the array.
isEverywhere([1, 2, 1, 3], 1)

    public static void main(String[] args) {

        int[] arrayInput = new int[] {1, 2, 1, 3};
        int input = 1;
        System.out.println(isEverywhere(arrayInput,input));



    }

    public static boolean isEverywhere(int[] arrayInput, int numeroInput){

        for (int i = 0; i < arrayInput.length -1; i++){
            if (arrayInput[i] != numeroInput && arrayInput[i+1] != numeroInput){
                return false;
            }

        }
        return true;
    }

*/

    /*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
     */
   /* public static void main(String[] args) {

        int[] arrayInput = new int[] {1, 3, 1, 3,2,3};

        System.out.println(threeTimes(arrayInput));




    }
    public static boolean threeTimes(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] == 3 && array[i+1] != 3 || i > 0 && array[i-1] != 3 && array[array.length -1] == 3){
                counter++;
            }
        }
        if (counter != 3) return false;
        return true;
    }
    */
    /*Given arrays nums1 and nums2 of the same length, for every element in nums1,
    consider the corresponding element in nums2 (at the same index).
     Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
     */

    public static int arraychecker (int [] nums1,int [] nums2){
        if (nums1.length != nums2.length){
            return -1;
        }
        int counter = 0;
        for (int i = 0; i < nums1.length; i++){
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff != 0 && diff <= 2 ){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        int[] arrayInput = new int[] {1,2,3};
        int[] arrayInput2 = new int[] {2,3,5};

        System.out.println(arraychecker(arrayInput,arrayInput2));

    }

}



