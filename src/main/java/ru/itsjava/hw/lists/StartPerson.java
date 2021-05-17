package ru.itsjava.hw.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartPerson {
    public static void main(String[] args) {
        Person dima = new Person("Dmitriy", 20, "male");
        Person oleg = new Person("Oleg", 17, "male");
        Person nikita = new Person("Nikita", 20, "male");
        Person olga = new Person("Olga", 20, "female");
        Person lena = new Person("Lena", 20, "female");
        Person alina = new Person("Alina", 21, "female");

        List<Person> people = new ArrayList<>(Arrays.asList(dima, oleg, nikita, olga, lena, alina));

        System.out.println(people);

        System.out.println("Призывники: ");
        for (int i = 0; i < people.size(); i++) {
            char findChar = 'N';
            char firstChar = people.get(i).getName().charAt(0);
            int age = people.get(i).getAge();
            String sex = people.get(i).getSex();
            if ("male".equals(sex) && (age > 17) && (age < 28) && (firstChar == findChar)) {
                System.out.println(people.get(i));
            }
        }

        System.out.println("Средний возраст женщин: ");
        int countWoman = 0;
        int ageSum = 0;
        for (int i = 0; i < people.size(); i++) {

            String sex = people.get(i).getSex();
            if ("female".equals(sex)) {
                ageSum += people.get(i).getAge();
                countWoman++;
            }
        }
        double midleAge = (double) ageSum / countWoman;
        System.out.println("midleAge = " + midleAge);

    }

}

