package ru.itsjava.hw;

import lombok.Data;

import javax.swing.*;

@Data
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws AgeNotValidException {
        this.name = name;
        if ((this.age = age) <= 0) {
            throw new AgeNotValidException("Возраст меньше или равен 0", age);
        }
        if ((this.age = age) >= 150) {
            throw new AgeNotValidException("Возраст больше или равен 150", age);
        }
        this.age = age;

    }

    public void birthday() {
        this.age = age + 1;
    }

    public boolean takeBear() {
        return this.age >= 18;
    }
}

//1. Написать свой класс Person с полями имя, возраст
//2. Метод void birthday() (который увеличивает возраст на 1)
//    и boolean takeBeer(), который проверяет возраст и выдает true если возраст больше 18 и false в ином случае
//3. Написать все возможные тесты на этот класс