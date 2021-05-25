package ru.itsjava.hw.lists.arraylist;

import java.util.Arrays;
import java.util.List;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;


    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public MyArrayList(List<String> asList) {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return realSize == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyArrayList { ");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) return true;
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }

        if (array.length - 1 - delIndex >= 0)
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        if (delIndex == -1) return false;
        else {
            realSize--;
            return true;
        }
    }

    public void clear() {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = null;
//        }
        Arrays.fill(array, null);
        this.realSize = 0;

    }

    public Object get(int index) {
        return array[index];
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        array[index] = element;
        return null;
    }

    public boolean add(int index, Object element) {
        checkIndex(index);
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        for (int i = array.length - index; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        realSize++;
        return true;
    }

    public Object remove(int index) {
        checkIndex(index);

        Object resElement = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) return i;
        }

        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (o.equals(array[i])) return i;
        }

        return -1;


    }
}
