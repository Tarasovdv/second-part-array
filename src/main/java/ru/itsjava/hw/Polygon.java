package ru.itsjava.hw;

public class Polygon {
    public static void main(String[] args) throws AgeNotValidException {

        try{
//            Person dima = new Person("Dmitriy", 29);
//            Person liza = new Person("Liza",17);

            Person lina = new Person("Lina",-100);
            System.out.println("lina = " + lina);


//            dima.birthday();
//            System.out.println(dima.getAge());
//            System.out.println(dima.takeBear());
//
//            System.out.println(liza.takeBear());
//            liza.birthday();
//            System.out.println(liza.takeBear());

        } catch (AgeNotValidException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getAges());
        }



    }
}
