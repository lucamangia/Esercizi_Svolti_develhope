/*public void main() {

   int [] array = new int[]{1,2,3,4,5,6};

    arrayTester(3,array);
}

public void arrayTester(int index,int [] array)
        throws ArithmeticException, IndexOutOfBoundsException{

    try {
        if (index >= array.length){
            throw new IndexOutOfBoundsException("L'indice inserito è più grande della lunghezza dell'array");
        }
        for (int i = 0; i < array.length; i++){
            if (i == index){
                int risultatoDivisoPerZero = array[index]/0;
                throw new ArithmeticException("Non divisibile per zero");
            }
        }

        }catch (Exception e){
        System.out.println(e.getMessage());
    }
}*/
public void main() {

    /*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing    */

    int primitivoInt = 42;
    double primitivoDouble = 3.14;
    char primitivoChar = 'Z';

    Integer oggettoInt = primitivoInt;
    Double oggettoDouble = primitivoDouble;
    Character oggettoChar = primitivoChar;

    Integer oggettoInt2 = 100;
    Double oggettoDouble2 = 2.718;
    Character oggettoChar2 = 'Y';

    int primitivoInt2 = oggettoInt2;
    double primitivoDouble2 = oggettoDouble2;
    char primitivoChar2 = oggettoChar2;
}

public void intInput(int uno, int due){
    System.out.println(uno+due);
}
public void charInput(char uno){
    System.out.println(uno);
}
public void integerInput(Integer uno, Integer due){
    System.out.println(Integer.sum(uno,due));
}
public void characterInput(Character uno){
    System.out.println(uno);
}


