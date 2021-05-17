package ru.itsjava.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {


        Watch dimaSeiko = new Watch("Seiko", "Dima", 10_000.0);
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 10_000.0);
        Watch olgaSeiko = new Watch("Seiko", "Olga", 30_000.0);
        Watch victorOmega = new Watch("Omega", "Victor", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(dimaSeiko, victorOmega, vitaliySeiko, olgaSeiko));
        System.out.println("Наши часы: " + watches);


        //вывести все сеико

        System.out.println("Seiko: ");
        for (Watch el : watches) {
            if (el.getFirm().equals("Seiko")) {
                System.out.println(el + " ");
            }
        }

        System.out.println("Price > 30_000.0 ");
        for (Watch el : watches) {
            if (el.getPrice() > 30_000.0) {
                System.out.println(el + " ");
            }
        }

        //пропустить первые 2 элемента фирмы сеико
        System.out.println("Пропустить первые 2 элемента фирмы сеико");

        int countSeiko = 0;
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seiko") && countSeiko < 2) {
                countSeiko++;
            }
            else System.out.println(watches.get(i));

        }


    }

}




