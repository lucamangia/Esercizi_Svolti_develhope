package co.develhope.eserciziVari;

public class RangeCheck {

    public boolean isNumberInRange(int number, int min, int max)
            throws IllegalArgumentException {

        if (number >= min && number <= max) {
            return true;
        } else {
            throw new IllegalArgumentException("Insert number is out of range");
        }
    }
}
