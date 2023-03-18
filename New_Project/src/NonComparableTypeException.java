//package SeminarOOP4_1403_HW2;

public class NonComparableTypeException extends Exception{
    public NonComparableTypeException(String type) {
        super(String.format("Тип %s не сопоставим", type));
    }
}