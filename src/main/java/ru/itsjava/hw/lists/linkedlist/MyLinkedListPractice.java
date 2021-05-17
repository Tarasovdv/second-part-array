package ru.itsjava.hw.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());
        System.out.println("list.contains(\"Строка 3\") = " + list.contains("Строка 3"));



        list.add("Строка 1 ");
        System.out.println("\nlist = " + list);
//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Строка 1\") = " + list.contains("Строка 1"));

        list.add("Строка 2");
        System.out.println("\nlist = " + list);
//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.isEmpty() = " + list.isEmpty());

        list.add("Строка 3");
        System.out.println("\nlist = " + list);
//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.isEmpty() = " + list.isEmpty());

        System.out.println("\nlist.contains(\"Строка 3\") = " + list.contains("Строка 3"));

//        list.remove(1);
        list.clear();
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list = " + list);


    }
}
