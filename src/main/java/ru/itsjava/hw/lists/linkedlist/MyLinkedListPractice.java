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
//        list.clear();
//        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list = " + list);
        list.set(0,"000");
        list.set(1,"111");
        list.set(2,"222");

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.get(2) = " + list.get(2));

        list.remove("22");
        System.out.println("list = " + list);


    }
}
