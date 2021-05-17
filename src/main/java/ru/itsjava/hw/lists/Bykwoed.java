package ru.itsjava.hw.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Bykwoed {
    public static void main(String[] args) {
        List<Book> booksEmptyCollection = new ArrayList<Book>(); // пустой размер 10
        List<Book> booksEmptyCollection_20 = new ArrayList<Book>(20); // пустой размер 20

        Book java = new Book("Философия Java", "Bruce Eckel");
        Book itsJava = new Book("itsJava", "Виталий Нежинский");
        Book musk = new Book("Elon Musk", "Eshley Vens");
        Book startup = new Book("Стартап на Милиард", "Максим Спиридонов");
        Book rich = new Book("Самый богатый человек в Вавилоне", "Джордж Клейсон");
        Book six = new Book("six", "six");
        Book seven = new Book("seven", "seven");
        Book java1 = new Book("Java", "auth1");
        Book java2 = new Book("Java", "auth2");
        Book java3 = new Book("Java", "aut");


        List<Book> myBooks = new ArrayList<Book>(Arrays.asList(java, itsJava, musk, startup, rich,
                java1, java2, java3));

//        System.out.println(myBooks.get(0));
//        System.out.println(myBooks.get(myBooks.size() - 1));

        System.out.println("Old List");
        printList(myBooks);

        System.out.println("\nNew List");
        myBooks.add(0, seven);
        myBooks.add(2, six);
        List<Book> secondList = new ArrayList<Book>();
        secondList.addAll(myBooks);
        printList(secondList);

        Iterator<Book> bookIterator = secondList.iterator();
        while (bookIterator.hasNext()) {
            Book nextBook = bookIterator.next();
            if (nextBook.getNaming().equals("seven")) {
                bookIterator.remove();
            }
        }

        secondList.remove(2);
        System.out.println("\nNext List");
        printList(secondList);

//        System.out.println(secondList.contains(musk));

        System.out.println("\n Вывести книги с индексом делимым на 3: ");
        for (int i = 0; i < secondList.size(); i++) {
            if ((i % 3) == 0) {
                System.out.println(secondList.get(i));
            }

        }

        System.out.println("\nКолличество книг название которых равно (Java): ");
        int countNameJava = 0;
        for (int i = 0; i < secondList.size(); i++) {
            if (secondList.get(i).getNaming().equals("Java")) {
                countNameJava++;
            }
        }
        System.out.println(countNameJava);

        System.out.println("\nПропустить первые три книги в списке: ");
        int countBook = 0;
        for (int i = 0; i < secondList.size(); i++) {
            if (countBook < 3) {
                countBook++;
            } else {System.out.println(secondList.get(i));}
        }

        System.out.println("\nПропустить первые 2 книги которые равны Java: ");
        int countJava = 0;
        for (int i = 0; i < secondList.size(); i++) {
            if (secondList.get(i).getNaming().equals("Java") && countJava < 2) {
                countJava++;
            } else {System.out.println(secondList.get(i));}
        }

        System.out.println("\nВернуть первую книгу, длина Имени автора делится на 3: ");
        for (int i = 0; i < secondList.size(); i++) {
            if ((secondList.get(i).getAuthor().length()) % 3 == 0) {
                System.out.println(secondList.get(i));
                break;
            }
        }

        System.out.println("\nВернуть все книги, длина Имени автора делится на 3: ");
        for (int i = 0; i < secondList.size(); i++) {
            if ((secondList.get(i).getAuthor().length()) % 3 == 0) {
                System.out.println(secondList.get(i));
            }
        }

    }

    public static void printList(List<Book> list) {
        int count = 0;
//        System.out.print("List: [");
        for (Book element : list) {
            System.out.println(count + ": " + element);
            count++;
        }
//        System.out.print("]");
    }


}


