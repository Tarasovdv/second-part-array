package ru.itsjava.hw;

public class AgeNotValidException extends Exception{

    private int ages;

    public int getAges() {
        return ages;
    }

    public AgeNotValidException(String message, int age){
        super(message);
       ages = age;
    }
}
