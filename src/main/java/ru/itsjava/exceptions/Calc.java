package ru.itsjava.exceptions;

public class Calc {

    public int division(int num, int divider) throws CalcException {
        try {
            return num / divider;
        } catch (ArithmeticException arithmeticException) {
            throw new CalcException();
        }


    }
}
