package ru.itsjava.linkedkist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.hw.lists.arraylist.MyArrayList;
import ru.itsjava.hw.lists.linkedlist.MyLinkedList;
import ru.itsjava.hw.lists.linkedlist.Node;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyLinkedList должен: ")
public class MyLinkedListTest {

    public static final int DEFAULT_SIZE = 0;
    public static final String DEFAULT_OBJECT = "123";
    public Node node = new Node("123",null);
    public Node node2 = new Node("www",null);

    @DisplayName(" должен корректно создавать список через конструктор")
    @Test
    public void shouldHaveCorrectConstructor() {
        MyLinkedList list = new MyLinkedList();

        assertEquals(DEFAULT_SIZE, list.size());

    }

    @DisplayName(" должен корректно показывать размер списка")
    @Test
    public void shouldHaveShowSize() {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        list2.add(DEFAULT_OBJECT);
//        assertEquals(DEFAULT_SIZE, list.size());
        assertAll("list",
                () -> assertEquals(DEFAULT_SIZE, list.size()),
                () -> assertEquals(1, list2.size()));

    }

    @DisplayName(" должен корректно показывать отображать статус списка (пустой/не пустой)")
    @Test
    public void shouldHaveShowIsEmpty() {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        list2.add(DEFAULT_OBJECT);
        assertAll("list",
                () -> assertEquals(true, list.isEmpty()),
                () -> assertEquals(false, list2.isEmpty()));

    }

    @DisplayName(" должен корректно показывать отображать статус наличия в списке объекта (существует/не...)")
    @Test
    public void shouldHaveContains() {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        list2.add(DEFAULT_OBJECT);
        assertAll("list",
                () -> assertEquals(false, list.contains(DEFAULT_OBJECT)),
                () -> assertEquals(true, list2.contains(DEFAULT_OBJECT)));

    }

    @DisplayName(" должен корректно добавлять объект в список")
    @Test
    public void shouldHaveAdd() {
//        MyArrayList list = new MyArrayList(Arrays.asList(DEFAULT_OBJECT,"1","22","333"));
        MyLinkedList list2 = new MyLinkedList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        assertAll("list",
//                ()-> assertEquals(4,list.size()),
                () -> assertEquals(5, list2.size()));

    }



    @DisplayName(" должен корректно удалять объект")
    @Test
    public void shouldHaveRemoveOfObject() {

        MyLinkedList list2 = new MyLinkedList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.remove("3");
        assertAll("list",
                () -> assertEquals(4, list2.size()));

    }

    @DisplayName(" должен корректно удалять объект по индексу")
    @Test
    public void shouldHaveRemoveOfIndex() {

        MyLinkedList list2 = new MyLinkedList();
        list2.add(DEFAULT_OBJECT);
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.remove(3);
        assertAll("list",
                () -> assertEquals(4, list2.size()));

    }

    @DisplayName(" должен корректно возвращать объект по индексу")
    @Test
    public void shouldHaveGetIndex() {

        MyLinkedList list2 = new MyLinkedList();
        list2.add("123");

        assertAll("list",
                () -> assertEquals(node, list2.get(0)));

    }

    @DisplayName(" должен корректно перезаписывать объект по индексу")
    @Test
    public void shouldHaveSetIndex() {

        MyLinkedList list2 = new MyLinkedList();
        list2.add("123");
        list2.set(0, "www");
        assertAll("list",
                () -> assertEquals(node2, list2.get(0)));

    }

    @DisplayName(" должен корректно возвращать индексу первого нахождения")
    @Test
    public void shouldHaveIndexOf() {

        MyLinkedList list2 = new MyLinkedList();
        list2.add("1");
        list2.add("2");
        list2.add("2");
        list2.add("4");

        assertAll("list",
                () -> assertEquals(1, list2.indexOf("2")));

    }

    @DisplayName(" должен корректно возвращать индексу последнего нахождения")
    @Test
    public void shouldHaveLastIndexOf() {

        MyLinkedList list2 = new MyLinkedList();
        list2.add("1");
        list2.add("2");
        list2.add("2");
        list2.add("2");

        assertAll("list",
                () -> assertEquals(3, list2.lastIndexOf("2")));

    }
}
