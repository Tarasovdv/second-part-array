package ru.itsjava.exceptions;

public class ExceptionsPractice {
    public static void main(String[] args) {

//        throw new RuntimeException("my runtime exeption");

//        try {
//            System.out.println("BEGIN");
////            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!!");
//            e.printStackTrace();
//        }finally {
//            System.out.println("FINAL");
//        }
//
//        System.out.println(" END");
//        try {
//            throw new RuntimeException();
//        } catch (Throwable throwable) {
//            System.out.println("Throwable");
//        }

        Calc calc = new Calc();
        System.out.println("calc.division(5,3) = " + calc.division(5, 3));

        try{
            System.out.println("calc.division(5,0) = " + calc.division(5, 0));
        }catch (CalcException ce){
            System.out.println("ввели не то значение");
            ce.printStackTrace();
        }


    }
}
