package co.develhope.Lezioni.Lezione_14_01;

public class Main {
    /*Each resistor has a resistance value.

Resistors are small - so small in fact that if you printed the resistance value on them, it would be hard to read.
To get around this problem, manufacturers print color-coded bands onto the resistors to denote their resistance values.

Each band acts as a digit of a number. For example, if they printed a brown band (value 1) followed by a green band (value 5),
 it would translate to the number 15. In this exercise, you are going to create a helpful program so that you don't have to remember the values of the bands.
 The program will take 3 colors as input, and outputs the correct value, in ohms. The color bands are encoded as follows:

black: 0

brown: 1

red: 2

orange: 3

yellow: 4

green: 5

blue: 6

violet: 7

grey: 8

white: 9

In Resistor Color Duo you decoded the first two colors. For instance: orange-orange got the main value 33.
The third color stands for how many zeros need to be added to the main value.
 The main value plus the zeros gives us a value in ohms. For the exercise it doesn't matter what ohms really are.
  For example:

orange-orange-black would be 33 and no zeros, which becomes 33 ohms.
orange-orange-red would be 33 and 2 zeros, which becomes 3300 ohms.
orange-orange-orange would be 33 and 3 zeros, which becomes 33000 ohms.
(If Math is your thing, you may want to think of the zeros as exponents of 10. If Math is not your thing,
go with the zeros. It really is the same thing, just in plain English instead of Math lingo.)

This exercise is about translating the colors into a label:

"... ohms"

So an input of "orange", "orange", "black" should return:

"33 ohms"

When we get to larger resistors, a metric prefix is used to indicate a larger magnitude of ohms, such as "kiloohms".
That is similar to saying "2 kilometers" instead of "2000 meters", or "2 kilograms" for "2000 grams".

For example, an input of "orange", "orange", "orange" should return:

"33 kiloohms"
*/


    public static int coloreCode (String color){
        return ColorBands.valueOf(color).ordinal();
    }

    public static int ohmsTotalValue (String colore,String colore2,String colore3){
        colore = colore.toUpperCase();
        colore2 = colore2.toUpperCase();
        colore3 = colore3.toUpperCase();
        int singleValue1 = coloreCode(colore);
        int singleValue2 = coloreCode(colore2);
        int moltiplicator = (int) Math.pow(10,coloreCode(colore3));
        int totalValue   = (singleValue1 * 10 + singleValue2) * moltiplicator;
        return totalValue;
    }

    public static void main(String[] args) {

      /* String color1 = "Brown";
       String color2 = "White";
       String color3 = "Blue";

        System.out.println(ohmsTotalValue(color1,color2,color3));
*/
        String color1 = "Red";
        String color2 = "Violet";
        String color3 = "Orange";

        System.out.println(ohmsTotalValue(color1,color2,color3));






    }
}


