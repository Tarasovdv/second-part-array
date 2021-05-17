package ru.itsjava.arraylist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.hw.lists.arraylist.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyArrayList должен: ")
public class MyArrayListTest {
    private static final int DEFAULT_CAPACITY = 10;
    public static final int DEFAULT_SIZE = 0;
    public static final String DEFAULT_OBJECT = "123";
    private Object[] array;

    @DisplayName(" должен корректно создавать список через конструктор")
    @Test
    public void shouldHaveCorrectConstructor(){
        MyArrayList list = new MyArrayList();

        assertEquals(DEFAULT_SIZE, list.size());

    }

    @DisplayName(" должен корректно показывать размер списка")
    @Test
    public void shouldHaveShowSize(){
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
//        assertEquals(DEFAULT_SIZE, list.size());
        assertAll("list",
                ()-> assertEquals(DEFAULT_SIZE,list.size()),
                ()-> assertEquals(1,list2.size()));

    }
    @DisplayName(" должен корректно показывать отображать статус списка (пустой/не пустой)")
    @Test
    public void shouldHaveShowIsEmpty(){
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        assertAll("list",
                ()-> assertEquals(true,list.isEmpty()),
                ()-> assertEquals(false,list2.isEmpty()));

    }
    @DisplayName(" должен корректно показывать отображать статус наличия в списке объекта (существует/не...)")
    @Test
    public void shouldHaveContains(){
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        assertAll("list",
                ()-> assertEquals(false,list.contains(DEFAULT_OBJECT)),
                ()-> assertEquals(true,list2.contains(DEFAULT_OBJECT)));

    }
    @DisplayName(" должен корректно добавлять объект в список")
    @Test
    public void shouldHaveAdd(){
//        MyArrayList list = new MyArrayList(Arrays.asList(DEFAULT_OBJECT,"1","22","333"));
        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        assertAll("list",
//                ()-> assertEquals(4,list.size()),
                ()-> assertEquals(5,list2.size()));

    }
    @DisplayName(" должен корректно добавлять объект в список по индексу")
    @Test
    public void shouldHaveAddIndex(){
//        MyArrayList list = new MyArrayList(Arrays.asList(DEFAULT_OBJECT,"1","22","333"));
        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add(2,"qqq");
        assertAll("list",
                ()-> assertEquals("qqq",list2.get(2)),
                ()-> assertEquals(6,list2.size()));

    }
    @DisplayName(" должен корректно удалять объект")
    @Test
    public void shouldHaveRemoveOfObject(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.remove("3");
        assertAll("list",
                ()-> assertEquals(false,list2.contains("3")),
                ()-> assertEquals(4,list2.size()));

    }
    @DisplayName(" должен корректно удалять объект по индексу")
    @Test
    public void shouldHaveRemoveOfIndex(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.remove(3);
        assertAll("list",
                ()-> assertEquals(false,list2.contains("3")),
                ()-> assertEquals(4,list2.size()));

    }
    @DisplayName(" должен корректно возвращать объект по индексу")
    @Test
    public void shouldHaveGetIndex(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        assertAll("list",
                ()-> assertEquals(DEFAULT_OBJECT,list2.get(0)),
                ()-> assertEquals("3",list2.get(3)));

    }
    @DisplayName(" должен корректно перезаписывать объект по индексу")
    @Test
    public void shouldHaveSetIndex(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.set(2,"www");
        assertAll("list",
                ()-> assertEquals("3",list2.get(3)),
                ()-> assertEquals("www",list2.get(2)));

    }





}
